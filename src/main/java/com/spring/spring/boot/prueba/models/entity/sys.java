package com.spring.spring.boot.prueba.models.entity;

public class sys {
	Long type;
	Long id;
	String country;
	Long sunrise;
	Long sunset;
	
	
	
	public sys(Long type, Long id, String country, Long sunrise, Long sunset) {
		this.type = type;
		this.id = id;
		this.country = country;
		this.sunrise = sunrise;
		this.sunset = sunset;
	}
	public Long getType() {
		return type;
	}
	public void setType(Long type) {
		this.type = type;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Long getSunrise() {
		return sunrise;
	}
	public void setSunrise(Long sunrise) {
		this.sunrise = sunrise;
	}
	public Long getSunset() {
		return sunset;
	}
	public void setSunset(Long sunset) {
		this.sunset = sunset;
	}
	
	
	
}
