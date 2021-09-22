package com.spring.spring.boot.prueba.repository;

import java.io.IOException;
import java.io.InputStream;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Repository;


import com.spring.spring.boot.prueba.models.entity.WeatherReg;



@Repository
public class WeatherRepository {
    
	@SuppressWarnings({"unchecked" })
	@GET
	public Response findAll(String q,String lang,String units){
		Map<String,WeatherReg> reg = new HashMap<String,WeatherReg>();
	    InputStream jsonreader;
		String url_lang="https://api.openweathermap.org/data/2.5/weather?q="+q+"+&appid="+ApiWheatherConfig.appId+"&lang="+lang+"&units="+units;
		
		try {

			jsonreader = new URL(url_lang).openStream();
			
		    reg = new ObjectMapper().readValue(jsonreader, HashMap.class);
			System.out.println(reg);

		    
		} catch (IOException e) {
		    String message = "{\"Cod\": \"404\",\"Error\": \"city not found\"  }";
			System.out.println(url_lang);
		    return Response
		    	      .status(Status.NOT_FOUND)
		    	      .entity(message)
		    	      .type(MediaType.APPLICATION_JSON)
		    	      .build();
	    }
		System.out.println(url_lang);
	    return Response.status(Status.OK).entity(reg).type(MediaType.APPLICATION_JSON).build();
	}
}
