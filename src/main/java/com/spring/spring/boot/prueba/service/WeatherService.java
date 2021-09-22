package com.spring.spring.boot.prueba.service;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



@Path("/weathers")
@Produces(MediaType.APPLICATION_JSON)
public interface WeatherService {


    @GET
    public Response getAllWeathers(@QueryParam("q") String q,@QueryParam("lang") String lang,@QueryParam("units") String units);
    
    
}
