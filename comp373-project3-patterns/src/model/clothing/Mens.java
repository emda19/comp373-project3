package model.clothing;

/*
 * Implementation of Department that denotes if a child object of Clothing is in the Men's Department
 */

public class Mens implements Department {

	@Override
	public void findShirt() {
		System.out.println("Shirt Location: Men's Department");
	}

	@Override
	public void findPants() {
		System.out.println("Pants Location: Men's Department");
		
	}

}
