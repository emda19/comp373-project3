package model.order;
import java.util.List;
import model.clothing.Clothing;

/*
 * This class is used to represent a clothing order
 * It can be visited by OrderReceipt
 */

public class Order implements IOrder {
	private String orderNumber;
	private List<Clothing> purchasedClothing;
	private float orderTotal;
	private String orderStatus;
	
	//Non-default constructor to set instance variables
	public Order(String orderNumber, List<Clothing> purchasedClothing) {
		this.orderNumber = orderNumber;
		this.purchasedClothing = purchasedClothing;
		this.orderStatus = "Pending";
	}
	
	// Getters for instance variables
	
	public String getOrderNumber() {
		return this.orderNumber;
	}
	
	public List<Clothing> getPurchasedClothing() {
		return this.purchasedClothing;
	}
	
	public float getOrderTotal() {
		return this.orderTotal;
	}
	
	public String getOrderStatus() {
		return this.orderStatus;
	}
	
	// Used by the visit to update the order cost
	public void setOrderTotal(float total) {
		this.orderTotal = total;
	}
	
	// Accept IOrderReceipt Visitor
	public void accept(IOrderReceipt visitor) {
		visitor.visitOrder(this);
	}
	
	//Add clothing to the order
	public void addClothing(Clothing c) {
		this.purchasedClothing.add(c);
	}
	
	// Different Order states
	
	//Order has been placed
	public void placeOrder() {
		this.orderStatus = "Placed";
	}
	//Order has been shipped
	public void shipOrder() {
		this.orderStatus = "Shipped";
	}
	//Order has been delivered
	public void deliverOrder() {
		this.orderStatus = "Delivered";
	}
		
}
