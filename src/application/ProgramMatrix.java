package application;

import java.util.Scanner;

public class ProgramMatrix {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int m = input.nextInt();
		int n = input.nextInt();

		int[][] matrix = new int[m][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextInt();
			}
		}

		int x = input.nextInt();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				if (x == matrix[i][j]) {

					System.out.println("Position " + i + ":" + j);
					if (j > 0) {
						System.out.println("Left: " + matrix[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matrix[i - 1][j]);
					}
					if (j < matrix[i].length - 1) {
						System.out.println("Right: " + matrix[i][j + 1]);
					}
					if (i < matrix.length - 1) {
						System.out.println("Down: " + matrix[i + 1][j]);
					}

				} 

			}
		}

		input.close();
	}

}
