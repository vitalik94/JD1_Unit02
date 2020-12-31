package by.htp.arrays03.main;

import java.util.Random;

/* 
 * Дан двухмерный массив n x m  элементов. 
 * Определить, сколько раз встречается число 7 среди  элементов массива. 
 */

public class Task08 {

	public static void main(String[] args) {

		int n = 3;
		int m = 4;

		int[][] mas = new int[n][m];

		Random(mas);
		print(mas);
		printMas(mas);

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

	public static void printMas(int[][] mas) {

		int n = 0;

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (mas[i][j] == 7) {

					n = n + 1;

				}

			}

		}

		System.out.println("число 7 встречается " + n + " раз(а)");

	}

}
