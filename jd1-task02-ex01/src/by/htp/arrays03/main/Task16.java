package by.htp.arrays03.main;

/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): 
 * 
 * 1*2 0  0 ... 0    0    0
 *  0 2*3 0 ... 0    0    0
 *  0  0 3*4... 0    0    0
 *  .  .  . ... .    .    .
 *  0  0  0 ... 0  n(n-1) 0
 *  0  0  0 ... 0    0  n(n+1)
 */

public class Task16 {

	public static void main(String[] args) {

		int n = 10;
		int m = 1;

		int[][] mas = new int[n][n];

		mas(mas, m);
		print(mas);

	}

	public static void mas(int[][] mas, int m) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (j == i) {

					mas[i][j] = m * (m + 1);

					m++;

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
