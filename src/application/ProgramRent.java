package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class ProgramRent {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		Rent[] vect = new Rent[10];

		System.out.print("How many rooms will be rented? ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Email: ");
			String email = input.nextLine();
			System.out.print("Roon: ");
			int roon = input.nextInt();

			vect[roon] = new Rent(name, email);

		}
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {

			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);

			}

		}

		input.close();

	}

}
