package by.htp.arrays03.main;

import java.util.Random;

// Отсотрировать столбцы матрицы по возрастанию и убыванию значений элементов

public class Task33 {

	public static void main(String[] args) {

		int n = 5;

		int[][] mas = new int[n][n];

		Random(mas);
		print(mas);
		masMinSort(mas, n);
		print(mas);
		masMaxSort(mas, n);
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

	public static void masMinSort(int[][] mas, int n) {

		int min = 0;
		int imin = 0;

		for (int j = 0; j < n; j++) {

			for (int i = 0; i < mas.length; i++) {

				min = mas[i][j];
				imin = i;

				for (int a = i + 1; a < mas.length; a++) {

					if (min > mas[a][j]) {

						min = mas[a][j];

						imin = a;

					}

				}

				mas[imin][j] = mas[i][j];

				mas[i][j] = min;

			}

		}

	}

	public static void masMaxSort(int[][] mas, int n) {

		int max = 0;
		int imax = 0;

		for (int j = 0; j < n; j++) {

			for (int i = 0; i < mas.length; i++) {

				max = mas[i][j];
				imax = i;

				for (int a = i + 1; a < mas.length; a++) {

					if (max < mas[a][j]) {

						max = mas[a][j];

						imax = a;

					}

				}

				mas[imax][j] = mas[i][j];

				mas[i][j] = max;

			}

		}

	}

}
