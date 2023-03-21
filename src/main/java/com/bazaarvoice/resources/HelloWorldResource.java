package com.bazaarvoice.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloWorldResource {

    @GET
    public String get(){
        return "hello world";
    }
}
