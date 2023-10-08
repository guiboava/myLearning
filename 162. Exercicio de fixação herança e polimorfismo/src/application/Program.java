package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter frt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.printf("Product %d data:%n", i);
			System.out.print("Common, used or imported ? (c/u/i)? ");
			char c = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			switch (c) {
			case 'c': {
				list.add(new Product(name, price));
				break;
			}
			case 'u': {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(),frt01);
				list.add(new UsedProduct(name, price, date));
				break;
			}
			case 'i': {
				System.out.print("Customs fee: ");
				double feeCustoms = sc.nextDouble();
				list.add(new ImportedProduct(name, price, feeCustoms));
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + c);
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product p : list) {
			System.out.print(p.priceTag());
		} 
		sc.close();
	}

}
