package by.htp.arrays03.main;

import java.util.Random;

// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него. 

public class Task35 {

	public static void main(String[] args) {

		int m = 3;

		int n = 4;

		int[][] mas = new int[m][n];
		
		int max = 0;

		Random(mas);
		print(mas);
		max = masMax(mas, max);
		mas(mas, max);
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

	public static int masMax(int[][] mas, int max) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (max < mas[i][j]) {

					max = mas[i][j];

				}

			}

		}

		System.out.println(max);
		
		System.out.println();

		return max;

	}

	public static void mas(int[][] mas, int max) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (mas[i][j] % 2 != 0) {

					mas[i][j] = max;

				}

			}

		}

	}

}
