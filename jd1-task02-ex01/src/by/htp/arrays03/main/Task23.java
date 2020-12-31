package by.htp.arrays03.main;

/*
 * Сформировать квадратную матрицу порядка N по правилу: 
 * 
 * A[I,J] = SIN((I^2 - J^2)/ N)
 * 
 * и подсчитать количество положительных элементов в ней. 
 */

public class Task23 {

	public static void main(String[] args) {

		int n = 5;

		double[][] A = new double[n][n];

		int b = 0;

		mas(A, n);
		print(A, b);

	}

	public static void mas(double[][] A, int n) {

		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A[i].length; j++) {

				A[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);

			}

		}

	}

	public static void print(double[][] A, int b) {

		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A[i].length; j++) {

				System.out.printf("mas[%d][%d] = %-10.5f", i, j, A[i][j]);

				if (A[i][j] > 0) {

					b++;

				}

			}

			System.out.println();

		}

		System.out.println();

		System.out.println("количество положительных элементов: " + b);

	}

}
