package by.htp.arrays03.main;

import java.util.Random;

// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали. 

public class Task09 {

	public static void main(String[] args) {

		int n = 5;

		int[][] mas = new int[n][n];

		Random(mas);
		print(mas);
		printDiagonal(mas, n);

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

	public static void printDiagonal(int[][] mas, int n) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (i == j) {

					System.out.printf("mas[%d][%d] = %-6d", i, j, mas[i][j]);

				}

			}

		}

		System.out.println();
		System.out.println();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (i + j == n - 1) {

					System.out.printf("mas[%d][%d] = %-6d", i, j, mas[i][j]);

				}

			}

		}

	}

}
