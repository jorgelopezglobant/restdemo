package com.restexample.rest;

import com.restexample.model.Hardware;
import org.springframework.web.bind.annotation.RequestBody;
import sun.security.util.ManifestEntryVerifier;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by jorge.lopez on 6/4/2017.
 */
@Path("/hardware")
@Produces(MediaType.APPLICATION_JSON)
public interface RestHardware {

    String HARDWARE_ID_FIELD = "idHardware";

    @GET
    @Path("/")
    List<Hardware> findAll();

    @GET
    @Path("/{"+ HARDWARE_ID_FIELD +"}")
    Hardware findOne(@PathParam(HARDWARE_ID_FIELD) int idHardware);

    @POST
    @Path("/")
    void save(@RequestBody Hardware hardware);

    @DELETE
    @Path("/{"+ HARDWARE_ID_FIELD +"}")
    void delete(@PathParam(HARDWARE_ID_FIELD) int idHardware);

    @PUT
    @Path("/")
    void update(@RequestBody Hardware hardware);
}
