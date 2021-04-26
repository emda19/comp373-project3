package model.order;

import java.util.Collection;
import java.util.Iterator;

import model.clothing.Clothing;
import model.clothing.Pants;
import model.clothing.Shirt;
import model.customer.Address;
import model.customer.Customer;

/*
 * This class acts as a Visitor in order to print out an order summary
 */

public class OrderReceipt implements IOrderReceipt {

	private float totalPrice;
	
	// Visit the Order element & print its attributes
	public void visitOrder(Order orderE) {
		System.out.println("Order number: "+orderE.getOrderNumber());
		//System.out.println("Total Cost: $"+orderE.getOrderTotal());
		System.out.println("Order status: "+orderE.getOrderStatus());
		this.visitCollection(orderE.getPurchasedClothing());
		//After collection is visited, update & print the total
		orderE.setOrderTotal(this.totalPrice);
		System.out.println("Order total:\t\t\t$" + orderE.getOrderTotal());
	}
	
	// Collection collection = orderE.getPurchasedClothing();
	public void visitCollection(Collection collection) {
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			if (obj instanceof Clothing) {
				((Clothing) obj).accept(this);
			}
		}
	}
	
	// Visit the Shirt element & print its attributes
	public void visitShirt(Shirt shirtE) {
		System.out.println("\nProduct #"+shirtE.getProductNumber()+"\t\t\t$"+shirtE.getPrice());
		System.out.println("Product type: Shirt");
		System.out.println("Size: "+shirtE.getSize());
		System.out.println("Color: "+shirtE.getColor());
		System.out.println("Sleeve Length: "+shirtE.getSleeveLength());
		//Bridge pattern, print department
		shirtE.find();
		//Calculate total price of order for summary
		this.totalPrice += shirtE.getPrice();
	}
	
	// Visit the Pants element & print its attributes
	public void visitPants(Pants pantsE) {
		System.out.println("\nProduct #"+pantsE.getProductNumber()+"\t\t\t$"+pantsE.getPrice());
		System.out.println("Product type: Pants");
		System.out.println("Size: "+pantsE.getSize());
		System.out.println("Color: "+pantsE.getColor());
		System.out.println("Sleeve Length: "+pantsE.getPantLength());
		//Bridge pattern, print department
		pantsE.find();
		//Calculate total price of order for summary
		this.totalPrice += pantsE.getPrice();
	}
	
}
