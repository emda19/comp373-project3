package model.order;

import java.util.List;

import model.clothing.Clothing;
import model.customer.ICustomer;

/*
 * Interface used to visit all Elements associated with Order
 * Also allows Customer to access an abstraction of Order
 */

public interface IOrder {

	// Getters for Customer
	public String getOrderNumber();
	public List<Clothing> getPurchasedClothing();
	public float getOrderTotal();
	public String getOrderStatus();
	public ICustomer getCustomer();
	
	public void setOrderTotal(float total);
	
	// Accept visitor IOrderReceipt
	public void accept(IOrderReceipt visitor);
	
	//Add to purchased items
	public void addClothing(Clothing c);
	
	//Order Status updates
	public void placeOrder();
	public void shipOrder();
	public void deliverOrder();
	
	//Subject to an Observer
	public void attach(Notifier observer);
	public void detach(Notifier observer);
}
