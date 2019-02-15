package application;

import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class ProgramOrder {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		//SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = input.nextLine();
		System.out.print("Email: ");
		String email = input.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = Order.getDate().parse(input.nextLine());
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = input.nextLine();
		

		Order order = new Order(new Date(), OrderStatus.valueOf(status), new Client(name, email, birthDate));


		System.out.print("How many items to this order? ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			input.nextLine();
			String productName = input.nextLine();
			System.out.print("Product price: ");
			double price = input.nextDouble();
			System.out.print("Quantity: ");
			int quantity = input.nextInt();

			Product product = new Product(productName, price);
			OrderItem Items = new OrderItem(quantity, price, product);
			order.addItem(Items);

		}
		System.out.println();
		System.out.println(order);
		
		/*System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println("Order moment: " + order.getMoment());
		System.out.println("Order status: " + order.getStatus());
		System.out.println("Client: " + order.getClient().getName() + " (" + order.getClient().getBirthDate() + ") - " + order.getClient().getEmail());
		System.out.println("Order items:");
		System.out.println(order.getItems());*/
		

		input.close();

	}

}
