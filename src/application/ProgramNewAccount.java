package application;

import java.util.Locale;
import java.util.Scanner;

import entities.NewAccount;
import exceptions.DomainException;

public class ProgramNewAccount {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
	try {
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = input.nextInt();
		System.out.print("Holder: ");
		input.nextLine();
		String holder = input.nextLine();
		System.out.print("Initial balance: ");
		double balance = input.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = input.nextDouble();
		
		NewAccount account = new NewAccount(number, holder, balance, withdrawLimit);
		System.out.println();
		
		System.out.print("Enter amount for withdraw: ");
		double amount = input.nextDouble();
		
		account.withdraw(amount);
		
		
		System.out.println("New balance: " + account.getBalance());
	}
	
		catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
	
		input.close();
	}

}