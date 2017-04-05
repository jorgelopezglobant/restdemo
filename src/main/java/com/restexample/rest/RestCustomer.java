package com.restexample.rest;

import com.restexample.model.Customer;
import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by jorge.lopez on 4/4/2017.
 */
@Path("/customer")
public interface RestCustomer {

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    List<Customer> findAll();

    @GET
    @Path("/{idCustomer}")
    @Produces(MediaType.APPLICATION_JSON)
    Customer findOne(@PathParam("idCustomer") int idCustomer);

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    void addCustomer(@RequestBody Customer customer);

    @DELETE
    @Path("/{idCustomer}")
    @Produces(MediaType.APPLICATION_JSON)
    void deleteCustomer(@PathParam("idCustomer") int idCustomer);

}
