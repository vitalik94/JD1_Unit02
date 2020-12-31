package by.htp.arrays03.main;

import java.util.Random;

/*
 * Магическим квадратом порядка n называется квадратная матрица размера n x n, 
 * составленная из чисел 1, 2, 3, ..., n^2 так, что суммы по каждому столбцу, 
 * каждой строке и каждой из двух больших диагоналей равны между собой. 
 * Построить такой квадрат. Пример магического квадрата порядка 3: 
 * 
 * 6  1  8 
 * 7  5  3 
 * 2  9  4
 */

public class Task40 {

	public static void main(String[] args) {

		int n = 3;

		int[][] mas = new int[n][n];

		int a = 0;

		mas(mas, n);
		a = masSum(mas, n, a);
		printSum(mas, a, n);

	}

	public static void mas(int[][] mas, int n) {

		int i = 0;

		int j = n / 2;

		for (int b = 1; b < Math.pow(n, 2) + 1; b++) {

			mas[i][j] = b;

			i--;
			j++;

			if (b % n == 0) {

				i = i + 2;

				j--;

			} else {

				if (i < 0) {

					i = i + n;

				} else if (j == n) {

					j = j - n;

				}

			}

		}

	}

	public static int masSum(int[][] mas, int n, int a) {

		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;

		int m;

		m = (n * ((int) Math.pow(n, 2) + 1)) / 2;

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				sum = sum + mas[i][j];

				if (i == j) {

					sum1 = sum1 + mas[i][j];

				}
				if (i + j == n - 1) {

					sum2 = sum2 + mas[i][j];

				}

			}

			if (sum == m) {

				a++;

			}

			sum = 0;

		}

		if (sum1 == m & sum2 == m) {

			a = a + 2;

		}

		for (int j = 0; j < n; j++) {

			for (int i = 0; i < mas.length; i++) {

				sum = sum + mas[i][j];

			}

			if (sum == m) {

				a++;

			}

			sum = 0;

		}

		return a;

	}

	public static void printSum(int[][] mas, int a, int n) {

		if (a == n * 2 + 2) {

			for (int i = 0; i < mas.length; i++) {

				for (int j = 0; j < mas[i].length; j++) {

					System.out.printf("mas[%d][%d] = %-6d", i, j, mas[i][j]);

				}

				System.out.println();

			}

			System.out.println();
			System.out.println("Магический квадрат");

		}

	}

}
