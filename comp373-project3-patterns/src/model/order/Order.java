package model.order;
import java.util.ArrayList;
import java.util.List;
import model.clothing.Clothing;
import model.customer.ICustomer;

/*
 * This class is used to represent a clothing order
 * It can be visited by OrderReceipt
 */

public class Order implements IOrder {
	private String orderNumber;
	private List<Clothing> purchasedClothing;
	private float orderTotal;
	private String orderStatus; //Changes notify observers
	private ICustomer customer;
	
	//List of observers attached to this class
	private List<Notifier> observers = new ArrayList<Notifier>();
	
	//Non-default constructor to set instance variables
	public Order(String orderNumber, List<Clothing> purchasedClothing, ICustomer customer) {
		this.orderNumber = orderNumber;
		this.purchasedClothing = purchasedClothing;
		this.orderStatus = "Pending";
		this.customer = customer;
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
	public ICustomer getCustomer() {
		return this.customer;
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
	
	
	// Observer is notified when the order status changes
	public void attach(Notifier observer) {
		this.observers.add(observer);
	}
	public void detach(Notifier observer) {
		this.observers.remove(observer);
	}
	
	// Notify observers on changes
	public void notifyObservers() {
		for (Notifier observer : observers) {
			observer.update();
		}
	}
	
	// Setting different Order states for Observer
	
	//Order has been placed
	public void placeOrder() {
		this.orderStatus = "Placed";
		notifyObservers();
	}
	//Order has been shipped
	public void shipOrder() {
		this.orderStatus = "Shipped";
		notifyObservers();
	}
	//Order has been delivered
	public void deliverOrder() {
		this.orderStatus = "Delivered";
		notifyObservers();
	}
	
	
	
}
