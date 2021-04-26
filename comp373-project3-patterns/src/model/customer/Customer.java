package model.customer;

import java.util.List;

import model.order.IOrder;

/* 
 * Class to hold all customer information
 */

public class Customer {
	
	private String firstName;
	private String lastName;
	private String email;
	private IAddress shippingAddress;
	private List<IOrder> orderHistory;
	
	//Non-default constructor to fill in customer information (like a sign up process for the site)
	public Customer(String firstName, String lastName, String email, IAddress shippingAddress, List<IOrder> orderHistory) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.shippingAddress = shippingAddress;
		this.orderHistory = orderHistory;
	}
	
	// Add an order to the customer's order history
	public void addOrder(IOrder order) {
		this.orderHistory.add(order);
	}
	
	// Setters for instance variables
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setShippingAddress(IAddress address) {
		this.shippingAddress = address;
	}
	public void setOrderHistory(List<IOrder> orderHistory) {
		this.orderHistory = orderHistory;
	}
	
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
	public List<IOrder> getOrderHistory() {
		return this.orderHistory;
	}
}
