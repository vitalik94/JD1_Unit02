package by.htp.arrays03.main;

/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 * 
 * 1  2   3  ... n
 * n n-1 n-2 ... 1
 * 1  2   3  ... n
 * n n-1 n-2 ... 1
 * .  .   .  ... . 
 * 1  2   3  ... n
 */

public class Task13 {

	public static void main(String[] args) {

		int n = 10;

		int[][] mas = new int[n][n];

		mas(mas, n);
		print(mas);

	}

	public static void mas(int[][] mas, int n) {

		for (int i = 0; i < mas.length; i++) {

			if (i % 2 == 0) {

				for (int j = 0; j < mas[i].length; j++) {

					mas[i][j] = j + 1;

				}

			} else {

				for (int j = 0; j < mas[i].length; j++) {

					mas[i][j] = n - j;

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
