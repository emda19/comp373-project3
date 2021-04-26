package model.customer;

/* This class is used to format an address in Customer */

public class Address {

	private String street;
	private String city;
	private String state;
	private String zipcode;
	
	public Address(String street, String city, String state, String zipcode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	// Setters for instance variables
	
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	// Getters for instance variables
	
	public String getStreet() {
		return this.street;
	}
	public String getCity() {
		return this.city;
	}
	public String getState() {
		return this.state;
	}
	public String getZipcode() {
		return this.zipcode;
	}
}
