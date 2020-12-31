package by.htp.arrays03.main;

import java.util.Random;

/*
 * Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. 
 * Посчитать количество двузначных чисел в ней.
 */

public class Task31 {

	public static void main(String[] args) {

		int n = 10;

		int[][] mas = new int[n][n];

		int a = 0;

		Random(mas);
		print(mas);
		mas(mas, a);

	}

	public static void Random(int[][] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = rand.nextInt(999);

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

	public static void mas(int[][] mas, int a) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (mas[i][j] > 9 & mas[i][j] < 100) {

					a++;

				}

			}

		}

		System.out.println("количество двузначных чисел в матрице: " + a);

	}

}
