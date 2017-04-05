package com.restexample.rest;

import com.restexample.model.Mobile;
import com.restexample.service.MobileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
@Path("/mobile")
@Produces(MediaType.APPLICATION_JSON)
public interface RestMobile {

    String MOBILE_ID_FIELD = "idMobile";

    @GET
    @Path("/")
    List<Mobile> findAll();

    @GET
    @Path("/{"+MOBILE_ID_FIELD+"}")
    Mobile findOne(@PathParam(MOBILE_ID_FIELD) int idMobile);

    @POST
    @Path("/")
    void save(@RequestBody Mobile mobile);

    @DELETE
    @Path("/{"+MOBILE_ID_FIELD+"}")
    void delete(@PathParam(MOBILE_ID_FIELD) int idMobile);

    @PUT
    @Path("/")
    void update(@RequestBody Mobile mobile);
}
