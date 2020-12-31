package by.htp.arrays03.main;

import java.util.Random;

// Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9]

public class Task02 {

	public static void main(String[] args) {

		int[][] mas = new int[2][3];

		Random(mas);
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

	}

}
