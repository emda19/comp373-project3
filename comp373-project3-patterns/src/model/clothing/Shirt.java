package model.clothing;

/*
 * Shirt is a subclass to Clothing, representing one category of Clothing
*/

public class Shirt extends Clothing {

	private String productNumber;
	private float price;
	private String size; //Size key: XS, S, M, L, XL
	private String color;
	private String sleeveLength; //Sleeve length key: none, short, mid-length, long
	
	// Non-default constructor
	public Shirt(String productNumber, float price, String size, String color, String sleeveLength, Department department) {
		super(department); //Access the Department interface through Clothing constructor
		this.productNumber = productNumber;
		this.price = price;
		this.size = size;
		this.color = color;
		this.sleeveLength = sleeveLength;
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
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public String getSize() {
		return this.size;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setSleeveLength(String sleeveLength) {
		this.sleeveLength = sleeveLength;
	}
	
	public String getSleeveLength() {
		return this.sleeveLength;
	}
	
	// Defining superclass method to call correct Department Methods for this implementation
	
	public void find() {
		department.findShirt(productNumber, price, size, color, sleeveLength);
	}
	
}
