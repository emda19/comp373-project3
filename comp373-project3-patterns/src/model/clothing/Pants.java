package model.clothing;

import model.order.IOrderReceipt;

/*
 * Pants is a subclass of Clothing, representing one category of Clothing
 */

public class Pants extends Clothing {

	private String productNumber;
	private float price;
	private int size; // Pants sized by numbers
	private String color;
	private String pantLength; // Pant Length key: short, regular, long
	
	// Non-default constructor
	public Pants(String productNumber, float price, int size, String color, String pantLength, Department department) {
		super(department); //Access the Cart interface through clothing constructor
		this.productNumber = productNumber;
		this.price = price;
		this.size = size;
		this.color = color;
		this.pantLength = pantLength;
	}
	
	// Setters & Getters for instance variables
	
	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}
	
	public String getProductNumber() {
		return this.productNumber;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setPantLength(String pantLength) {
		this.pantLength = pantLength;
	}
	
	public String getPantLength() {
		return this.pantLength;
	}
	
	// Defining superclass method to call correct Department Methods for this implementation
	public void find() {
		department.findPants();
	}
	
	// Defining superclass method for accepting a visitor
	public void accept(IOrderReceipt visitor) {
		visitor.visitPants(this);
	}
	
}
