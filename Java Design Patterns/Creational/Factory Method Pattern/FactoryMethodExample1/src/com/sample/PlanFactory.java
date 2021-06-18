package com.sample;

public class PlanFactory {

	public static Plan getPlan(String type) {
		if (type.equals("Domestic")) {
			return new Domestic();
		} else if (type.equals("Commercial")) {
			return new Commercial();
		} else if (type.equals("Institutional")) {
			return new Institutional();
		} else {
			return null;
		}
	}
}
