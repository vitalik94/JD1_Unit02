package by.htp.arrays02.main;

import java.util.Random;

public class Task1 {

	public static void main(String[] args) {

		// int n = 10;
		// int m = 5;

		int[] mas1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int[] mas2 = { 11, 12, 13, 14, 15 };

		int k = 5;

		int[] mas3 = new int[mas1.length + mas2.length];

		printMas(mas1, mas2);
		mas(mas1, mas2, mas3, k);

	}

	public static void printMas(int[] mas1, int[] mas2) {

		for (int i = 0; i < mas1.length; i++) {

			System.out.print(mas1[i] + ", ");

		}

		System.out.println();

		for (int j = 0; j < mas2.length; j++) {

			System.out.print(mas2[j] + ", ");

		}

		System.out.println();

	}

	public static void mas(int[] mas1, int[] mas2, int[] mas3, int k) {

		for (int n = 0; n < mas3.length;) {
			for (int i = 0; i < mas1.length; i++) {

				mas3[n] = mas1[i];

				System.out.print(mas3[n] + ", ");

				n++;

				if (i == k) {

					for (int j = 0; j < mas2.length; j++) {

						mas3[n] = mas2[j];

						System.out.print(mas3[n] + ", ");

						n++;

					}

				}

			}
		}
	}

	public static void Random(int[][] mas, int n) {

		Random rand = new Random();

		boolean c;

		int b = 0;
		int k = 0;

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = rand.nextInt((int) Math.pow(n, 2)) + 1;

				b = i;
				k = j;

				c = false;

				while (c == false) {

					if (k > 0 & b == 0) {

						k--;

						if (mas[i][j] == mas[b][k]) {

							mas[i][j] = rand.nextInt((int) Math.pow(n, 2)) + 1;

							k++;

						}

						c = false;

					} else if (k > 0 & b > 0) {

						k--;

						if (mas[i][j] == mas[b][k]) {

							mas[i][j] = rand.nextInt((int) Math.pow(n, 2)) + 1;

							k++;

						}

						c = false;

					} else if (k == 0 & b > 0) {

						k = n;

						k--;

						b--;

						if (mas[i][j] == mas[b][k]) {

							mas[i][j] = rand.nextInt((int) Math.pow(n, 2)) + 1;

							k++;

						}

						c = false;

					} else if (b == 0 & k == 0) {

						c = true;

					}

				}

				// System.out.printf("mas[%d][%d] = %-6d", i, j, mas[i][j]);

			}

			// System.out.println();

		}

		// System.out.println();

	}

}
