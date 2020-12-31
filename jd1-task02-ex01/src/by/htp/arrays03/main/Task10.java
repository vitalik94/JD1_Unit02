package by.htp.arrays03.main;

import java.util.Random;

// Дана матрица. Вывести k-ю строку и p-й столбец матрицы. 

public class Task10 {

	public static void main(String[] args) {

		int[][] mas = new int[3][4];

		int k = 1;
		int p = 2;

		Random(mas);
		print(mas);
		printMas(mas, k, p);

	}

	public static void Random(int[][] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = rand.nextInt(5);

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

	public static void printMas(int[][] mas, int k, int p) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (i == k) {

					System.out.printf("mas[%d][%d] = %-6d", i, j, mas[i][j]);

				}

			}

		}

		System.out.println();
		System.out.println();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (j == p) {

					System.out.printf("mas[%d][%d] = %-6d", i, j, mas[i][j]);

				}

			}

			System.out.println();

		}

	}

}
