package model.clothing;

/* 
 * Clothing is an abstraction used in Bridge pattern
 * It is used by the client to allow its children access to Department
 * This class does not need to be altered to add new clothing categories (OCP)
 */

public abstract class Clothing {

	protected Department department;
	
	//Non-default constructor allowing subclasses to access Cart
	public Clothing(Department department) {
		this.department = department;
	}
	
	public abstract void find();
}
