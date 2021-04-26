package model.order;

/*
 * This class is a concrete observer for order status notifications
 */
public class OrderStatusNotifier implements Notifier {

	private IOrder order; //Subject
	
	public OrderStatusNotifier(IOrder order) {
		this.order = order;
		this.order.attach(this); //Attach this observer to Order
	}
	
	// 'Sends an email' to the customer of the update in order status
	public void update() {
		String email = this.order.getCustomer().getEmail();
		System.out.println("Email notification sent to: "+email);
		System.out.println("Your order has been " +order.getOrderStatus()+"!");
	}

	
}
