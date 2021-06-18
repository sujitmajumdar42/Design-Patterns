package com.sample;

public class Index {
	
	public static void main(String[] args) {
		Plan domesticPlan = PlanFactory.getPlan("Domestic");
		System.out.println(domesticPlan.calculateBill(5));
		
		Plan commercialPlan = PlanFactory.getPlan("Commercial");
		System.out.println(commercialPlan.calculateBill(5));
		
		Plan institutionalPlan = PlanFactory.getPlan("Institutional");
		System.out.println(institutionalPlan.calculateBill(5));
	}
}
