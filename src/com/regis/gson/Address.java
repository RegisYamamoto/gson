package com.regis.gson;

public class Address {

	private String country;
	private String city;
	
	public Address(String country, String city) {
		super();
		this.country = country;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + "]";
	}

}