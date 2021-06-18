package com.sample;

public abstract class Plan {
	
	public abstract Integer getRate();
	
	public Integer calculateBill(Integer unit) {
		return getRate()*unit;
	}
}
