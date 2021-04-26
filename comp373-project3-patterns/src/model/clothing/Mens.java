package model.clothing;

public class Mens implements Department {

	@Override
	public void findShirt(String productNumber, float price, int size, String color, String sleeveLength) {
		System.out.println("Shirt Location: Men's Department");
	}

	@Override
	public void findPants(String productNumber, float price, int size, String color, String pantLength) {
		System.out.println("Pants Location: Men's Department");
		
	}

}
