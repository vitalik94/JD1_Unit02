package by.htp.arrays03.main;

import java.util.Random;

// Переставить строки матрицы случайным образом. 

public class Task37 {

	public static void main(String[] args) {

		int n = 3;

		int m = 4;

		int[][] mas = new int[n][m];

		Random(mas);
		print(mas);
		mas(mas);
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

	public static void mas(int[][] mas) {

		Random rand = new Random();

		int i = rand.nextInt(3);

		int a = rand.nextInt(3);

		int temp = 0;

		for (int j = 0; j < mas[i].length; j++) {

			temp = mas[i][j];

			mas[i][j] = mas[a][j];

			mas[a][j] = temp;

		}

	}

}
