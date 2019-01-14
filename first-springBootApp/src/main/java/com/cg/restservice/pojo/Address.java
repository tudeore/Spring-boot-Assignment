package com.cg.restservice.pojo;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	
	private int flatNumber;
	private String name;
	private String street;
	private String city;
	private int pinCode;
	
	
	
	public Address(int flatNumber, String name, String street, String city, int pinCode) {
		super();
		this.flatNumber = flatNumber;
		this.name = name;
		this.street = street;
		this.city = city;
		this.pinCode = pinCode;
	}
	public Address() {
		super();
	}
	public int getFlatNumber() {
		return flatNumber;
	}
	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	
	
	
}
