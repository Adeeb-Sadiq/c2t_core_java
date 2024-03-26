package com.tnif.inheritance.multiLevel;

public class Country {
	private String countryName;
	private String countryCapital;
	
	public Country(String countryname, String countrycapital) {
		this.countryName = countryname;
		this.countryCapital = countrycapital;
	}

	public String getCountryName() {
		return countryName;
	}

	public String getCountryCapital() {
		return countryCapital;
	}
	
	
}
