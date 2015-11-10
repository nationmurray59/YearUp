import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
	public ArrayList<Item> shoppingCart = new ArrayList<Item>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		introduction();
		ShoppingCart cart = new ShoppingCart();
		cart.shoppingCartWork();
	}

	public static void introduction() {
		// This method prints introduction message
		System.out.println("********************************");
		System.out.println("*                              *");
		System.out.println("*        Shopping Cart         *");
		System.out.println("*                              *");
		System.out.println("********************************");

	}

	public void shoppingCartWork() {
		System.out.println("Do you want to input items? Type y/n");
		Scanner sc = new Scanner(System.in);
		String reply = sc.nextLine();

		if (reply.equalsIgnoreCase("y")) {
			ScanItems();
		} else {
			System.out.println("Goodbye!");
		}

	}

	public void ScanItems() {
		
		
		System.out.println("Enter an item name: ");
		String name = sc.nextLine();
		System.out.println("Enter a price: ");
		double price = sc.nextDouble();

		Item nextItem = new Item(name, price);
		shoppingCart.add(nextItem);

		System.out.println("Are you done shopping Yes or No.");
		String reply = sc.nextLine();
	}
}