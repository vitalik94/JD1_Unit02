package by.htp.arrays03.main;

/*
 *  Дан линейный массив x1, x2,..., xn−1, xn. Получить действительную квадратную матрицу порядка n:
 *  
 *   x1   x2   x3  ...  xn
 *  x1^2 x2^2 x3^2 ... xn^2
 *  x1^3 x2^3 x3^3 ... xn^3
 *   .    .    .   ...  .
 *  x1^n x2^n x3^n ... xn^n
 */

public class Task24 {

	public static void main(String[] args) {

		int n = 5;

		int[][] mas = new int[n][n];

		mas(mas, n);
		print(mas);

	}

	public static void mas(int[][] mas, int n) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = (int) Math.pow(j + 1, i);

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
