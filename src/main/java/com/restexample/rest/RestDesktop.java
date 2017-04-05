package com.restexample.rest;

import com.restexample.model.Desktop;
import com.restexample.model.Laptop;
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
@Path("/desktop")
@Produces(MediaType.APPLICATION_JSON)
public interface RestDesktop {

    String DESKTOP_ID_FIELD = "idDesktop";

    @GET
    @Path("/")
    List<Desktop> findAll();

    @GET
    @Path("/{"+ DESKTOP_ID_FIELD +"}")
    Desktop findOne(@PathParam(DESKTOP_ID_FIELD) int idDesktop);

    @POST
    @Path("/")
    void save(@RequestBody Desktop desktop);

    @DELETE
    @Path("/{"+ DESKTOP_ID_FIELD +"}")
    void delete(@PathParam(DESKTOP_ID_FIELD) int idDesktop);

    @PUT
    @Path("/")
    void update(@RequestBody Desktop desktop);
}
