package by.htp.arrays03.main;

import java.util.Random;

/* 
 * Дана матрица размера m x n. Вывести ее элементы в следующем порядке: 
 * первая строка справа налево, вторая строка слева направо, 
 * третья строка справа налево и так далее.
 */

public class Task11 {

	public static void main(String[] args) {

		int[][] mas = new int[3][4];

		Random(mas);
		print(mas);
		mas(mas);

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

		for (int i = 0; i < mas.length; i++) {

			if (i % 2 == 0) {

				for (int j = mas[i].length; j > 0; j--) {

					System.out.printf("mas[%d][%d] = %-6d", i, j, mas[i][j - 1]);

				}

				System.out.println();

			} else {

				for (int j = 0; j < mas[i].length; j++) {

					System.out.printf("mas[%d][%d] = %-6d", i, j, mas[i][j]);

				}

				System.out.println();

			}

		}

	}

}
