package com.restexample.rest;

import com.restexample.model.Software;
import org.springframework.web.bind.annotation.RequestBody;

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
 * Created by jorge.lopez on 5/4/2017.
 */
@Path("/software")
@Produces(MediaType.APPLICATION_JSON)
public interface RestSoftware {

    String SOFTWARE_ID_FIELD = "idSoftware";

    @GET
    @Path("/")
    List<Software> findAll();

    @GET
    @Path("/{"+ SOFTWARE_ID_FIELD +"}")
    Software findOne(@PathParam(SOFTWARE_ID_FIELD) int idSoftware);

    @POST
    @Path("/")
    void save(@RequestBody Software software);

    @PUT
    @Path("/")
    void update(@RequestBody Software software);

    @DELETE
    @Path("/{"+ SOFTWARE_ID_FIELD +"}")
    void delete(@PathParam(SOFTWARE_ID_FIELD) int idSoftware);

}
