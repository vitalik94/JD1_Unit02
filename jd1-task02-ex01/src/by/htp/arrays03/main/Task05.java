package by.htp.arrays03.main;

import java.util.Random;

// Дана матрица. Вывести на экран все четные строки, то есть с четными номерами

public class Task05 {

	public static void main(String[] args) {

		int[][] mas = new int[3][4];

		Random(mas);
		print(mas);
		printEven(mas);

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

	public static void printEven(int[][] mas) {

		for (int i = 1; i < mas.length; i++) {

			if (i % 2 == 0) {

				for (int j = 0; j < mas[i].length; j++) {

					System.out.printf("mas[%d][%d] = %-6d", i, j, mas[i][j]);

				}

			}

			System.out.println();

		}

	}

}
