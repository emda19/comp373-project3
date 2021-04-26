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
	public Order(String orderNumber, List<Clothing> purchasedClothing, float orderTotal, String orderStatus) {
		this.orderNumber = orderNumber;
		this.purchasedClothing = purchasedClothing;
		this.orderStatus = orderStatus;	
		this.orderTotal = orderTotal;
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
	
	// Accept IOrderReceipt Visitor
	public void accept(IOrderReceipt visitor) {
		visitor.visitOrder(this);
	}
	
}
