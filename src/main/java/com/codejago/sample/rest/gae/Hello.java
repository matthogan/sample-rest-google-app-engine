package com.codejago.sample.rest.gae.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author matto
 */
@Path ( "/")
public class Hello
{

    @GET
    @Path ( "/hello")
    public Response index()
    {
        return Response.status( 200 ).entity( "Hello" ).build();
    }
}
