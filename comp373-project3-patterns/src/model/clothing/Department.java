package model.clothing;

/* 
 *  This interface is used to facilitate Bridge pattern
 *  Department allows for the separation of Clothing from its multiple implementations
 */

public interface Department {

	// Subclasses of the abstraction Clothing
	// Adding clothing to its relative department
	
	public void findShirt();
	
	public void findPants();
}
