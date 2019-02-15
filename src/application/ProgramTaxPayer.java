package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;
import entities.Company;
import entities.Individual;

public class ProgramTaxPayer {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char type = input.next().charAt(0);
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = input.nextDouble();

			if (type == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = input.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));

			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = input.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}

		}
		System.out.println();
		System.out.println("TAXES PAID:");
		double total = 0;
		for (TaxPayer tax : list) {

			System.out.println(tax.getName() + ": " + String.format("$ %.2f", tax.Tax()));
			total += tax.Tax();

		}
		System.out.println();
		System.out.println("TOTAL TAXES: " + String.format("$ %.2f", total));
		input.close();
	}

}
