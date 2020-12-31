package by.htp.arrays03.main;

import java.util.Random;

// Дан двухмерный массив 5 x 5. Найти сумму модулей отрицательных нечетных элементов. 

public class Task07 {

	public static void main(String[] args) {

		int n = 5;

		int[][] mas = new int[n][n];

		Random(mas);
		print(mas);
		printSum(mas);

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

	public static void printSum(int[][] mas) {

		int sum = 0;

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (mas[i][j] % 2 != 0 & mas[i][j] < 0) {

					System.out.printf("mas[%d][%d] = %-6d", i, j, mas[i][j]);

					sum = Math.abs(sum + mas[i][j]);

				}

			}

			System.out.println();

		}

		System.out.println();

		System.out.println("sum = " + sum);

	}

}
