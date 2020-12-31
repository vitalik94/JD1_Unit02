package by.htp.arrays03.main;

/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 * 
 *  1    2   3 ... n-2  n-1  n
 *  2    3   4 ... n-1   n   0
 *  3    4   5 ...  n    0   0
 *  .    .   . ...  .    .   .
 * n-1   n   0 ...  0    0   0
 *  n    0   0 ...  0    0   0
 */

public class Task22 {

	public static void main(String[] args) {

		int n = 10;

		int[][] mas = new int[n][n];

		mas(mas, n);
		print(mas);

	}

	public static void mas(int[][] mas, int n) {

		int a, b;

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (j + i == n - 1) {

					mas[i][j] = n;

					a = j;

					b = n;

					while (a > -1) {

						mas[i][a] = b;

						a--;
						b--;

					}

				} else if (j > i) {

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
