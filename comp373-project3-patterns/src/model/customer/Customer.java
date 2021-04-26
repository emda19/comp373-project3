package model.customer;

import java.util.Collection;

import model.order.IOrder;

/* 
 * Class to hold all customer information
 * Customer is able to accept a visitor
 */

public class Customer implements ICustomer {
	
	private String firstName;
	private String lastName;
	private String email;
	private IAddress shippingAddress;
	private Collection<IOrder> orderHistory;
	
	//Non-default constructor to fill in customer information (like a sign up process for the site)
	public Customer(String firstName, String lastName, String email, IAddress shippingAddress, Collection<IOrder> orderHistory) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.shippingAddress = shippingAddress;
		this.orderHistory = orderHistory;
	}
	
	// Setters for instance variables
	
	
	// Getters for instance variables
	
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getEmail() {
		return this.email;
	}
	public IAddress getShippingAddress() {
		return this.shippingAddress;
	}
	public Collection<IOrder> getOrderHistory() {
		return this.orderHistory;
	}
}
