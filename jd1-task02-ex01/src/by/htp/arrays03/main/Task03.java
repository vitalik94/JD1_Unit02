package by.htp.arrays03.main;

import java.util.Random;

// Дана матрица. Вывести на экран первый и последний столбцы. 

public class Task03 {

	public static void main(String[] args) {

		int n = 3;
		int m = 4;

		int[][] mas = new int[n][m];

		Random(mas);
		print(mas);
		printColumns(mas, m);

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

	public static void printColumns(int[][] mas, int m) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length;) {

				System.out.printf("mas[%d][%d] = %-6d", i, j, mas[i][m - m]);
				break;
			}

			System.out.println();

		}

		System.out.println();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length;) {

				System.out.printf("mas[%d][%d] = %-6d", i, j, mas[i][m - 1]);
				break;
			}

			System.out.println();

		}

	}

}
