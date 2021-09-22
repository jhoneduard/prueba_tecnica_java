package com.spring.spring.boot.prueba.models.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonPropertyOrder({
	   "coord",
	   "weather",
	   "base",
	   "main",
	   "visibility",
	   "wind",
	   "clouds",
	   "dy",
	   "sys",
	   "timezone",
	   "id",
	   "name",
	   "cod"
	})
public class WeatherReg {
	
	private Coord coord;
	private Weather weather;
	private String base;
	private main main;
	private Long visibility;
	private wind wind;
	private clouds clouds;
	private Long dt;
	private sys sys;
	private Long timezone;
	private Long id;
	private String name;
	private Long cod;
	

	public WeatherReg(Coord coord, Weather weather, String base, main main,
			Long visibility, wind wind,
			clouds clouds, Long dt,
			sys sys, Long timezone, Long id, String name, Long cod) {
		this.coord = coord;
		this.weather = weather;
		this.base = base;
		this.main = main;
		this.visibility = visibility;
		this.wind = wind;
		this.clouds = clouds;
		this.dt = dt;
		this.sys = sys;
		this.timezone = timezone;
		this.id = id;
		this.name = name;
		this.cod = cod;
	}
	
	public Coord getCoord() {
		return coord;
	}
	public void setCoord(Coord coord) {
		this.coord = coord;
	}
	public Weather getWeather() {
		return weather;
	}
	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public main getMain() {
		return main;
	}
	public void setMain(main main) {
		this.main = main;
	}
	public Long getVisibility() {
		return visibility;
	}
	public void setVisibility(Long visibility) {
		this.visibility = visibility;
	}
	public wind getWind() {
		return wind;
	}
	public void setWind(wind wind) {
		this.wind = wind;
	}
	public clouds getClouds() {
		return clouds;
	}
	public void setClouds(clouds clouds) {
		this.clouds = clouds;
	}
	public long getDt() {
		return dt;
	}
	public void setDt(Long dt) {
		this.dt = dt;
	}
	public sys getSys() {
		return sys;
	}
	public void setSys(sys sys) {
		this.sys = sys;
	}
	public Long getTimezone() {
		return timezone;
	}
	public void setTimezone(Long timezone) {
		this.timezone = timezone;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getCod() {
		return cod;
	}
	public void setCod(Long cod) {
		this.cod = cod;
	}

	
	
	
	
}
