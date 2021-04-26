package model.order;

import java.util.List;

import model.clothing.Clothing;

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
	
	// Accept visitor IOrderReceipt
	public void accept(IOrderReceipt visitor);
}
