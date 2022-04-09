package org.example.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/demo")
public class TestResource {

    @GET
    @Path("/service-name")
    public Response getServiceName(){
        return Response.status(Response.Status.OK)
                .entity("Demo Application")
                .type(MediaType.APPLICATION_JSON_TYPE)
                .build();
    }
}
