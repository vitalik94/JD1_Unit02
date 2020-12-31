package by.htp.arrays03.main;

import java.util.Random;

// Найти положительные элементы главной диагонали квадратной матрицы.

public class Task29 {

	public static void main(String[] args) {

		int n = 5;

		int[][] mas = new int[n][n];

		Random(mas);
		print(mas);
		mas(mas);

	}

	public static void Random(int[][] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = rand.nextInt(20) - 10;

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

	public static void mas(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (j == i) {

					if (mas[i][j] > 0) {

						System.out.printf("mas[%d][%d] = %-6d", i, j, mas[i][j]);

					}

				}

			}

		}

	}

}
