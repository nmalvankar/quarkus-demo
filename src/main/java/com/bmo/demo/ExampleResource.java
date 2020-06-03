package com.bmo.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class ExampleResource {

    private String[] runtimes = {"quarkus", "spring-boot", "eap", "thorntail"};

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello world";
    }

    @Path("/runtimes")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response languages() {
        return Response.ok().entity(runtimes).build();
    }
}