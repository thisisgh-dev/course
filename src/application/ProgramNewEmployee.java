package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.NewEmployee;

public class ProgramNewEmployee {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		List<NewEmployee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = input.nextInt();
		System.out.println();

		for (int i = 1; i <= n; i++) {

			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			input.nextLine();
			int id = input.nextInt();
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Salary: ");
			double salary = input.nextDouble();
			System.out.println();

			list.add(new NewEmployee(id, name, salary));

		}

		System.out.print("Enter the employee id that will have salary increase: ");
		int id = input.nextInt();

		NewEmployee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = input.nextDouble();
			emp.increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employees:");
		for (NewEmployee x : list) {
			System.out.println(x);
		}

		input.close();

	}

}
