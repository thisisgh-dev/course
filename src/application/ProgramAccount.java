package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramAccount {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int number = input.nextInt();
		System.out.print("Enter account holder: ");
		input.nextLine();
		String holder = input.nextLine();

		System.out.print("Is there na initial deposit (y/n)? ");
		String deposit = input.next();

		double value = 0;
		if (deposit.equalsIgnoreCase("Y") == true) {
			System.out.print("Enter initial deposit value: ");
			value = input.nextDouble();

		}

		Account account = new Account(number, holder, value);
		System.out.println();
		System.out.println(account);

		System.out.print("Enter a deposit value: ");
		value = input.nextDouble();
		account.AccountCashIn(value);

		System.out.println();
		System.out.println("Updated Account data:\n" + account);

		System.out.print("Enter a withdraw value: ");
		value = input.nextDouble();
		account.AccountCashOut(value);

		System.out.println();
		System.out.println("Updated Account data:\n" + account);

		input.close();

	}

}
