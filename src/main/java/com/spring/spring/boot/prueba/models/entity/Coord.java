package com.spring.spring.boot.prueba.models.entity;

public class Coord {
	double lon;
	double lat;
	
	
	
	public Coord(double lon, double lat) {
		this.lon = lon;
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	
	
	
}
