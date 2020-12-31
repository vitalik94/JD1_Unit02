package by.htp.arrays03.main;

import java.util.Random;

/*
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, 
 * причем в каждом столбце число единиц равно номеру столбца.
 */

public class Task34 {

	public static void main(String[] args) {

		int m = 3;

		int n = 4;

		int[][] mas = new int[m][n];

		mas(mas);
		print(mas);

	}

	public static void mas(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (j > i) {

					mas[i][j] = 1;

				}

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

}
