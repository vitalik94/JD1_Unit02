package by.htp.arrays03.main;

import java.util.Random;

// Дана матрица. Вывести на экран первую и последнюю строки

public class Task04 {

	public static void main(String[] args) {

		int n = 3;
		int m = 4;

		int[][] mas = new int[n][m];

		Random(mas);
		print(mas);
		printStrings(mas, n);

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

	public static void printStrings(int[][] mas, int n) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("mas[%d][%d] = %-6d", i, j, mas[n - n][j]);

			}

			System.out.println();

			break;

		}

		System.out.println();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("mas[%d][%d] = %-6d", i, j, mas[n - 1][j]);

			}

			System.out.println();

			break;

		}

	}

}
