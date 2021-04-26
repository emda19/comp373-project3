package model.customer;

import java.util.List;

import model.order.IOrder;

/*
 * Customer interface for RetailClient
 */
public interface ICustomer {

	public void addOrder(IOrder order);
	public String getFirstName();
	public String getLastName();
	public String getEmail();
	public IAddress getShippingAddress();
	public List<IOrder> getOrderHistory();
}
