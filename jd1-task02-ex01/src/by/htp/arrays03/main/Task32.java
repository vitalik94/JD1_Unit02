package by.htp.arrays03.main;

import java.util.Random;

// Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task32 {

	public static void main(String[] args) {

		int n = 5;

		int[][] mas = new int[n][n];

		Random(mas);
		print(mas);
		masMinSort(mas);
		print(mas);
		masMaxSort(mas);
		print(mas);

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

	public static void masMinSort(int[][] mas) {

		int min = 0;
		int jmin = 0;

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				min = mas[i][j];
				jmin = j;

				for (int a = j + 1; a < mas[i].length; a++) {

					if (min > mas[i][a]) {

						min = mas[i][a];

						jmin = a;

					}

				}

				mas[i][jmin] = mas[i][j];

				mas[i][j] = min;

			}

		}

	}

	public static void masMaxSort(int[][] mas) {

		int max = 0;
		int jmax = 0;

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				max = mas[i][j];
				jmax = j;

				for (int a = j + 1; a < mas[i].length; a++) {

					if (max < mas[i][a]) {

						max = mas[i][a];

						jmax = a;

					}

				}

				mas[i][jmax] = mas[i][j];

				mas[i][j] = max;

			}

		}

	}

}
