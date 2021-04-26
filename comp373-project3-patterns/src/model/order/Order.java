package model.order;
import java.util.List;
import model.clothing.Clothing;


public class Order implements IOrder {
	private List<Clothing> purchasedClothing;
	private float orderTotal;
	private String orderStatus;
	
	public Order(List<Clothing> purchasedClothing, float orderTotal, String orderStatus) {
		this.purchasedClothing = purchasedClothing;
		this.orderStatus = orderStatus;	
		this.orderTotal = orderTotal;
			
}
	public List<Clothing> purchasedClothing() {
		return this.purchasedClothing;
	}
	public float orderTotal() {
		return this.orderTotal; 
	}
	public String orderStatus() {
		return this.orderStatus;
	}
	
}
