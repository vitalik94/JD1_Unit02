package by.htp.arrays03.main;

import java.util.Random;

/*
 * Матрицу 10x20 заполнить случайными числами от 0 до 15. 
 * Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз. 
 */

public class Task30 {

	public static void main(String[] args) {

		int[][] mas = new int[10][20];

		Random(mas);
		print(mas);
		mas(mas);

	}

	public static void Random(int[][] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = rand.nextInt(15);

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

		int n = 0;

		System.out.println("номера строк в каких число 5 встречается три и более раз:");

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (mas[i][j] == 5) {

					n++;

				}

			}

			if (n >= 3) {

				System.out.println(i);

			}

			n = 0;

		}

	}

}
