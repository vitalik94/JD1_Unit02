package by.htp.arrays03.main;

/* 
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 * 
 * 1  1  1 ... 1  1  1
 * 1  0  0 ... 0  0  1
 * 1  0  0 ... 0  0  1
 * .  .  . ... .  .  .
 * 1  0  0 ... 0  0  1
 * 1  1  1 ... 1  1  1
 */

public class Task17 {

	public static void main(String[] args) {

		int n = 10;

		int[][] mas = new int[n][n];

		mas(mas, n);
		print(mas);

	}

	public static void mas(int[][] mas, int n) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (i == 0 | i == n - 1 | j == 0 | j == n - 1) {

					mas[i][j] = 1;

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
