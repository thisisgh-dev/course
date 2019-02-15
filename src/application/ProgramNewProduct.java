package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.NewProduct;
import entities.UsedProduct;

public class ProgramNewProduct {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List<NewProduct> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = input.next().charAt(0);
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Price: ");
			double price = input.nextDouble();
			if(type == 'c') {
				list.add(new NewProduct(name, price));
				
			}
			else if(type == 'u') {
				SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				input.nextLine();
				Date manufactureDate = date.parse(input.nextLine());
				list.add(new UsedProduct(name, price, manufactureDate));
				
			}
			else if(type == 'i'){
				System.out.print("Customs fee: ");
				double customsFee = input.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
			

		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for(NewProduct product : list) {
			System.out.println(product.priceTag());
			
		}

		input.close();

	}

}
