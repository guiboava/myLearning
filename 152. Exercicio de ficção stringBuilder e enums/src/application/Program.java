package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter frt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		LocalDate birthDate = LocalDate.parse(sc.next(),frt01);
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		LocalDateTime orderTime = LocalDateTime.now();
		Order order = new Order(orderTime, status, client);

		System.out.print("How many items to this order? ");
		int N = sc.nextInt();
		System.out.println();
		for (int i = 1; i <= N; i++) {
			System.out.printf("Enter #%d item data: %n", i);
			System.out.print("Product name: ");
			String prodName = sc.next();
			System.out.print("Product price: ");
			double prodPrice = sc.nextDouble();
			System.out.print("quantity: ");
			int prodQuat = sc.nextInt();
			
			Product product = new Product(prodName, prodPrice);
			OrderItem orderItem = new OrderItem(prodQuat, prodPrice, product);
			order.addItem(orderItem);
		}
		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);
		
		sc.close();
	}

}
