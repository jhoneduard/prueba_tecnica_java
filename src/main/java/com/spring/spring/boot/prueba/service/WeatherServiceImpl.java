package com.spring.spring.boot.prueba.service;



import javax.ws.rs.core.Response;
import com.spring.spring.boot.prueba.repository.WeatherRepository;

public class WeatherServiceImpl implements WeatherService{

    private final WeatherRepository repository;
    
    public WeatherServiceImpl(WeatherRepository repository) {
        this.repository = repository;
    }
    
	@Override
	public Response getAllWeathers(String q,String lang,String units) {
		return repository.findAll(q,lang,units);
	}
	


}
