package com.spring.spring.boot.prueba.repository;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;
import org.springframework.stereotype.Repository;

import com.spring.spring.boot.prueba.models.entity.DriverReg;
import com.spring.spring.boot.prueba.models.entity.WeatherReg;

@Repository
public class VehicleRepository {

	// private List<DriverReg> regDriver = new ArrayList<>();

	String url = "https://test.teclogi.com/Teclogi/services/vehicle";


	Response response = null;
	public Response RegisterVehicle(String tokenUser, DriverReg reg) {
		ObjectMapper mapper = new ObjectMapper();
		String json = "";
		boolean bo = false;
		 JSONObject jsonObject;
		try {
			json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(reg);
			
			
		      jsonObject = new JSONObject(json);


			System.out.println(jsonObject);
			
			
			
			System.out.println(tokenUser);

			InputStream jsonreader= jsonreader = new URL(url).openStream();

			bo = true;

			Client client = ClientBuilder.newClient();
			WebTarget webTarget = client.target(url);
			response = webTarget.request().accept(MediaType.APPLICATION_JSON)
					.header("tokenUser",tokenUser.toString())
					.post(Entity.entity(jsonObject,MediaType.APPLICATION_JSON));
		} catch (IOException ex) { 
			bo = false;
			ex.printStackTrace();
		}
if(bo){
	return response;
}else {
	return response;
}
	}



}
