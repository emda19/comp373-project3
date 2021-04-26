package model.customer;

/* Interface to be referenced by Customer in order to depend on an abstraction instead of the concrete class Address */

public interface IAddress {

	//Setters
	public void setStreet(String street);
	public void setCity(String city);
	public void setState(String state);
	public void setZipcode(String zipcode);
	
	//Getters
	public String getStreet();
	public String getCity();
	public String getState();
	public String getZipcode();
	
}
