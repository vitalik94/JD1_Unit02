package by.htp.arrays03.main;

/* 
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 * 
 *  1   1  1 ... 1  1  1
 *  2   2  2 ... 2  2  0
 *  3   3  3 ... 3  0  0
 *  .   .  . ... .  .  .
 * n-1 n-1 0 ... 0  0  0
 *  n   0  0 ... 0  0  0
 */

public class Task18 {

	public static void main(String[] args) {

		int n = 10;

		int[][] mas = new int[n][n];

		mas(mas, n);
		print(mas);

	}

	public static void mas(int[][] mas, int n) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (j < n) {

					mas[i][j] = i + 1;

				} else {

					mas[i][j] = 0;

				}

			}

			n--;

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
