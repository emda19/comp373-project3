package model.clothing;

/* 
 *  This interface is used to facilitate Bridge pattern
 *  Department allows for the separation of each abstraction from its multiple implementations
 */

public interface Department {

	// Subclasses of the abstraction Clothing
	// Adding clothing to its relative department
	
	public void findShirt(String productNumber, float price, String size, String color, String sleeveLength);
	
	public void findPants(String productNumber, float price, int size, String color, String pantLength);
}
