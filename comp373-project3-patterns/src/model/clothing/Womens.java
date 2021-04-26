package model.clothing;

public class Womens implements Department {

	@Override
	public void findShirt(String productNumber, float price, String size, String color, String sleeveLength) {
		System.out.println("Shirt Location: Women's Department");
	}

	@Override
	public void findPants(String productNumber, float price, int size, String color, String pantLength) {
		System.out.println("Pants Location: Women's Department");
		
	}

}
