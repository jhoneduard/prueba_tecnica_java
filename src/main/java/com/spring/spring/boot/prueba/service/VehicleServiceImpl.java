package com.spring.spring.boot.prueba.service;

import javax.ws.rs.core.Response;

import com.spring.spring.boot.prueba.models.entity.DriverReg;
import com.spring.spring.boot.prueba.repository.VehicleRepository;

public class VehicleServiceImpl implements VehicleService{
    
	private final VehicleRepository repositoryVeh;

	public VehicleServiceImpl(VehicleRepository repositoryVeh) {
		this.repositoryVeh = repositoryVeh;
	}



	@Override
	public Response RegisterVehicle(String tokenUser, DriverReg reg) {
		return repositoryVeh.RegisterVehicle(tokenUser, reg);
	}

}
