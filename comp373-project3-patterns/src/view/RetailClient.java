package view;

import model.clothing.Clothing;
import model.clothing.Mens;
import model.clothing.Shirt;
import model.clothing.Womens;

public class RetailClient {

	//Create customer
	//Create order
	
	//Create Women's Shirt
	String productNum1 = "93740394";
	float price1 = (float) 29.99;
	String size1 = "M";
	String color1 = "Blue";
	String sleeveLength1 = "Long";
	Clothing shirt1 = new Shirt(productNum1, price1, size1, color1, sleeveLength1, new Womens());
	//Create Men's Shirt
	String productNum2 = "36572859";
	float price2 = (float) 19.99;
	String size2 = "L";
	String color2 = "Red";
	String sleeveLength2 = "Short";
	Clothing shirt2 = new Shirt(productNum2, price2, size2, color2, sleeveLength2, new Mens());
	//Create Women's Pants
	
	//Create Men's Pants
}
