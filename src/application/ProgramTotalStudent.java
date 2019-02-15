package application;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramTotalStudent {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		Set<Integer> set = new HashSet<>();

		System.out.print("How many students for course A? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			set.add(number);
		}

		System.out.print("How many students for course B? ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			set.add(number);
		}

		System.out.print("How many students for course C? ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			set.add(number);
		}

		System.out.println("Total students: " + set.size());

		sc.close();

	}

}
