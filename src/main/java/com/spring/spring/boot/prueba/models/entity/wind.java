package com.spring.spring.boot.prueba.models.entity;

public class wind {
	Long speed;
	Long deg;
	
	
	
	public wind(Long speed, Long deg) {
		this.speed = speed;
		this.deg = deg;
	}
	
	public Long getSpeed() {
		return speed;
	}
	public void setSpeed(Long speed) {
		this.speed = speed;
	}
	public Long getDeg() {
		return deg;
	}
	public void setDeg(Long deg) {
		this.deg = deg;
	}
	
	
}
