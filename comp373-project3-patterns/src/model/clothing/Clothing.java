package model.clothing;


/* 
 * Clothing is an abstraction used in Bridge pattern
 * It is used by the client to allow its children access to Department
 * This class does not need to be altered to add new clothing categories (OCP)
 */

public abstract class Clothing {

	protected Department department;
	
	//Non-default constructor allowing subclasses to access Department
	public Clothing(Department department) {
		this.department = department;
	}
	
	// Subclasses can define this method to implement the correct Department method
	public abstract void find();
	
}
