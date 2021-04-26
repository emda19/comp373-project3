package model.clothing;

import model.order.IOrderReceipt;

/* 
 * Clothing is an abstraction used in Bridge pattern
 * It is used by the client to allow its children access to Department
 * This class does not need to be altered to add new clothing categories (OCP)
 * This abstract class also facilitates visitation from IOrderReceipt
 */

public abstract class Clothing {

	protected Department department; //Only visible to Clothing and its subclasses
	
	//Non-default constructor allowing subclasses to access Department
	public Clothing(Department department) {
		this.department = department;
	}
	
	// Subclasses can define this method to implement the correct Department method
	public abstract void find();
	
	// Subclasses can define this operation to accept a visitor
	public abstract void accept(IOrderReceipt visitor);
}
