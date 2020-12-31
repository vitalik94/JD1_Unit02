package by.htp.arrays03.main;

import java.util.Random;

// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего. 

public class Task06 {

	public static void main(String[] args) {

		int[][] mas = new int[3][4];

		Random(mas);
		print(mas);
		printUneven(mas);

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

	public static void printUneven(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (j % 2 != 0) {

					if (mas[0][j] > mas[mas.length - 1][j]) {

						System.out.printf("mas[%d][%d] = %-6d", i, j, mas[i][j]);

					}

				}

			}

			System.out.println();

		}

	}

}
