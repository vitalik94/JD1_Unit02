package by.htp.arrays03.main;

import java.util.Random;

/*
 * Операция сглаживания матрицы дает новую матрицу того же размера, 
 * каждый элемент которой получается как среднее арифметическое соседей соответствующего элемента 
 * исходной  матрицы.  Построить  результат сглаживания заданной матрицы 
 */

public class Task36 {

	public static void main(String[] args) {

		int n = 5;

		int[][] mas = new int[n][n];

		int[][] mas2 = new int[n][n];

		Random(mas);
		mas(mas, mas2, n);
		print(mas, mas2);

	}

	public static void Random(int[][] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = rand.nextInt(10);

			}

		}

	}

	public static void print(int[][] mas, int[][] mas2) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("mas[%d][%d] = %-6d", i, j, mas[i][j]);

			}

			System.out.println();

		}

		System.out.println();

		for (int i = 0; i < mas2.length; i++) {

			for (int j = 0; j < mas2[i].length; j++) {

				System.out.printf("mas[%d][%d] = %-6d", i, j, mas2[i][j]);

			}

			System.out.println();

		}

	}

	public static void mas(int[][] mas, int[][] mas2, int n) {

		for (int i = 0; i < mas2.length; i++) {

			for (int j = 0; j < mas2[i].length; j++) {

				if (i == 0) {

					if (j == 0) {

						mas2[i][j] = mas[i][j + 1] + mas[i + 1][j + 1] + mas[i + 1][j];

					} else if (j > 0 & j < n - 1) {

						mas2[i][j] = mas[i][j - 1] + mas[i][j + 1] + mas[i + 1][j - 1] + mas[i + 1][j]
								+ mas[i + 1][j + 1];

					} else {

						mas2[i][j] = mas[i][j - 1] + mas[i + 1][j - 1] + mas[i + 1][j];

					}

				} else if (i > 0 & i < n - 1) {

					if (j == 0) {

						mas2[i][j] = mas[i - 1][j] + mas[i - 1][j + 1] + mas[i][j + 1] + mas[i + 1][j + 1]
								+ mas[i + 1][j];

					} else if (j > 0 & j < n - 1) {

						mas2[i][j] = mas[i - 1][j - 1] + mas[i - 1][j] + mas[i - 1][j + 1] + mas[i][j + 1]
								+ mas[i][j - 1] + mas[i + 1][j - 1] + mas[i + 1][j] + mas[i + 1][j + 1];

					} else {

						mas2[i][j] = mas[i - 1][j] + mas[i - 1][j - 1] + mas[i][j - 1] + mas[i + 1][j - 1]
								+ mas[i + 1][j];

					}

				} else {

					if (j == 0) {

						mas2[i][j] = mas[i - 1][j] + mas[i - 1][j + 1] + mas[i][j + 1];

					} else if (j > 0 & j < n - 1) {

						mas2[i][j] = mas[i][j - 1] + mas[i - 1][j - 1] + mas[i - 1][j] + mas[i - 1][j + 1]
								+ mas[i][j + 1];

					} else {

						mas2[i][j] = mas[i][j - 1] + mas[i - 1][j - 1] + mas[i - 1][j];

					}

				}

			}

		}

	}

}
