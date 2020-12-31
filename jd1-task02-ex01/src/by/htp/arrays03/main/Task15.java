package by.htp.arrays03.main;

/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 * 
 * n  0  0 ... 0  0  0
 * 0 n-1 0 ... 0  0  0
 * 0  0 n-2... 0  0  0
 * .  .  . ... .  .  .
 * 0  0  0 ... 0  2  0
 * 0  0  0 ... 0  0  1
 */

public class Task15 {

	public static void main(String[] args) {

		int n = 10;

		int[][] mas = new int[n][n];

		mas(mas, n);
		print(mas);

	}

	public static void mas(int[][] mas, int n) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (j == i) {

					mas[i][j] = n - i;

				} else {

					mas[i][j] = 0;

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
