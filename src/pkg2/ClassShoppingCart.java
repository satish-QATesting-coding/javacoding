package pkg2;


class ShoppingCart{
	
	int totalPrice;
	void addItem(int price) {
		totalPrice = totalPrice + price;
		System.out.println("add iteam"+ " :" + price);
	}
	
	void removeItem(int price) {
		totalPrice = totalPrice -price;
		System.out.println("Removed iteam " + " : "+ price );
	}
	
	void displayTotal() {
		System.out.println("dispalay total amount"+ " : " +totalPrice);
	}
}
public class ClassShoppingCart {

	public static void main(String[] args) {
		ShoppingCart obj1=new ShoppingCart();
		obj1.addItem(500);
		obj1.removeItem(600);
		obj1.displayTotal();
       
	}

}
