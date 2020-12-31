package by.htp.arrays03.main;

import java.util.Random;

/*
 * Задана матрица неотрицательных чисел. 
 * Посчитать сумму элементов в каждом столбце. 
 * Определить, какой столбец содержит максимальную сумму. 
 */

public class Task28 {

	public static void main(String[] args) {

		int n = 3;
		int m = 4;

		int[][] mas = new int[n][m];

		Random(mas);
		print(mas);
		sum(mas, m);

	}

	public static void Random(int[][] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = rand.nextInt(10);

			}

		}

	}

	public static void print(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("mas[%d][%d] = %-6d", i, j, mas[i][j]);

			}

			System.out.println();

		}

		System.out.println();

	}

	public static void sum(int[][] mas, int m) {

		int jmax = 0;

		int sum = 0;

		int sumMax = 0;

		for (int j = 0; j < m; j++) {

			for (int i = 0; i < mas.length; i++) {

				sum = mas[i][j] + sum;

			}

			System.out.println("Сумма столбца " + j + ": " + sum);

			if (sumMax < sum) {

				sumMax = sum;

				jmax = j;

			}

			sum = 0;

		}
		
		System.out.print("\n");

		System.out.println("max сумма столбца " + jmax + " :" + sumMax);

	}

}
