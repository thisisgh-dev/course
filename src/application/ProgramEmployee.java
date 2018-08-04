package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();
		System.out.print("Enter your name: ");
		employee.name = sc.nextLine();
		System.out.print("Enter your gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Enter the tax: ");
		employee.tax = sc.nextDouble();
		System.out.println();
		System.out.printf("Employee: %s, $ %.2f%n", employee.name, employee.netSalary());
		System.out.println();
		System.out.print("Which percentage to increase salary: ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println();
		System.out.println("Update data: " + employee.grossSalary);

		sc.close();

	}

}
