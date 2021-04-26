package model.order;

import java.util.Collection;

import model.clothing.Pants;
import model.clothing.Shirt;

/*
 * Interface for Concrete Visitor OrderReceipt
 */
public interface IOrderReceipt {

	public void visitOrder(Order orderE);
	public void visitCollection(Collection collection);
	public void visitShirt(Shirt shirtE);
	public void visitPants(Pants pantsE);
}
