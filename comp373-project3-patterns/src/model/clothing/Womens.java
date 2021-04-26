package model.clothing;

/*
 * Implementation of Department that denotes if a child object of Clothing is in the Women's Department
 */

public class Womens implements Department {

	@Override
	public void findShirt() {
		System.out.println("Shirt Location: Women's Department");
	}

	@Override
	public void findPants() {
		System.out.println("Pants Location: Women's Department");
		
	}

}
