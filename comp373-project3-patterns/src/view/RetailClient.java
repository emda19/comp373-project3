package view;


import java.util.ArrayList;

import model.clothing.Clothing;
import model.clothing.Mens;
import model.clothing.Pants;
import model.clothing.Shirt;
import model.clothing.Womens;
import model.customer.Address;
import model.customer.Customer;
import model.customer.IAddress;
import model.customer.ICustomer;
import model.order.IOrder;
import model.order.IOrderReceipt;
import model.order.Notifier;
import model.order.Order;
import model.order.OrderReceipt;
import model.order.OrderStatusNotifier;

public class RetailClient {
	
	public static void main(String[] args) {
		
	
		// Create a new Customer
		IAddress address = new Address("1234 Maple St.","Chicago","IL","60660");
		ICustomer customer = new Customer("Emily","Daly","edaly3@luc.edu", address, new ArrayList<>());
	
		// Create Women's Shirt
		Clothing shirt1 = new Shirt("93740394", (float) 29.99, "M", "Blue", "Long", new Womens());
		
		// Create Men's Shirt
		Clothing shirt2 = new Shirt("36572858", (float) 19.99, "L", "Red", "Short", new Mens());
		
		// Create Women's Pants
		Clothing pants1 = new Pants("21545111", (float) 59.99, 6, "Light Denim Wash", "Regular", new Womens());
		
		// Create Men's Pants
		Clothing pants2 = new Pants("24624531", (float) 49.99, 33, "Black Denim Wash", "Long", new Mens());
	
		// Create an Order
		IOrder order = new Order("0004217", new ArrayList<>(), customer);
		order.addClothing(shirt1);
		order.addClothing(shirt2);
		order.addClothing(pants1);
		order.addClothing(pants2);
		
		// Add to Customer order history
		customer.addOrder(order);
		
		// Print out an Order Summary with Visitor Pattern
		IOrderReceipt visitor = new OrderReceipt();
		visitor.visitOrder((Order) order); //Print order details
		
		System.out.println("\n*****************************************************************");
		//Observer pattern to notify customers of an updated order status
		new OrderStatusNotifier(order); //create the observer object
		System.out.println("\n(system places order)");
		order.placeOrder();
		System.out.println("\n(system ships order)");
		order.shipOrder();
		System.out.println("\n(system delivers order)");
		order.deliverOrder();
	}
}
