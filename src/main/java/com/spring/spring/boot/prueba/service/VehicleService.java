package com.spring.spring.boot.prueba.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.spring.spring.boot.prueba.models.entity.DriverReg;

@Path("/vehicles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface VehicleService {

	@POST
	@Produces( "application/json" )
	public Response RegisterVehicle(@HeaderParam("tokenUser") String tokenUser, DriverReg reg);
	
}
