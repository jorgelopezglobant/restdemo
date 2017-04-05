package com.restexample.rest;

import com.restexample.model.Laptop;
import com.restexample.model.Mobile;
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
@Path("/laptop")
@Produces(MediaType.APPLICATION_JSON)
public interface RestLaptop {

    String LAPTOP_ID_FIELD = "idLaptop";

    @GET
    @Path("/")
    List<Laptop> findAll();

    @GET
    @Path("/{"+ LAPTOP_ID_FIELD +"}")
    Laptop findOne(@PathParam(LAPTOP_ID_FIELD) int idLaptop);

    @POST
    @Path("/")
    void save(@RequestBody Laptop laptop);

    @DELETE
    @Path("/{"+ LAPTOP_ID_FIELD +"}")
    void delete(@PathParam(LAPTOP_ID_FIELD) int idLaptop);

    @PUT
    @Path("/")
    void update(@RequestBody Laptop laptop);
}
