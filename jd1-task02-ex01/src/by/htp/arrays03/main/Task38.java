package by.htp.arrays03.main;

import java.util.Random;

// Найдите сумму двух матриц 

public class Task38 {

	public static void main(String[] args) {

		int n = 3;

		int[][] mas1 = new int[n][n];

		int[][] mas2 = new int[n][n];

		int[][] mas3 = new int[n][n];

		Random(mas1, mas2);
		masSum(mas1, mas2, mas3);
		print(mas1, mas2, mas3);

	}

	public static void Random(int[][] mas1, int[][] mas2) {

		Random rand = new Random();

		for (int i = 0; i < mas1.length; i++) {

			for (int j = 0; j < mas1[i].length; j++) {

				mas1[i][j] = rand.nextInt(10);

			}

		}

		for (int i = 0; i < mas2.length; i++) {

			for (int j = 0; j < mas2[i].length; j++) {

				mas2[i][j] = rand.nextInt(10);

			}

		}

	}

	public static void print(int[][] mas1, int[][] mas2, int[][] mas3) {

		for (int i = 0; i < mas1.length; i++) {

			for (int j = 0; j < mas1[i].length; j++) {

				System.out.printf("mas[%d][%d] = %-6d", i, j, mas1[i][j]);

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

		System.out.println();

		for (int i = 0; i < mas3.length; i++) {

			for (int j = 0; j < mas3[i].length; j++) {

				System.out.printf("mas[%d][%d] = %-6d", i, j, mas3[i][j]);

			}

			System.out.println();

		}

	}

	public static void masSum(int[][] mas1, int[][] mas2, int[][] mas3) {

		for (int i = 0; i < mas3.length; i++) {

			for (int j = 0; j < mas3[i].length; j++) {

				mas3[i][j] = mas1[i][j] + mas2[i][j];

			}

		}

	}

}
