package com.bazaarvoice.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/learning")
public class LearningTheApp {
    @GET
    public String get(){
        return "new APP at hand";
    }
}
