package com.tnif.inheritance;

public class City extends State{
	private String cityName;
	private int pinNo;
	
	public City(String cityname, int pinno, String statename, int area, String cn, String cc){
		super(statename,area,cn,cc);
		this.cityName = cityname;
		this.pinNo = pinno;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", pinNo=" + pinNo + ", getStateName()=" + getStateName() + ", getArea()="
				+ getArea() + ", getCountryName()=" + getCountryName() + ", getCountryCapital()=" + getCountryCapital()
				+ "]";
	}

	
	
}
