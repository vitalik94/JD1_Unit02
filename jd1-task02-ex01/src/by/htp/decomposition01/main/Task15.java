package by.htp.decomposition01.main;

/*  
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
 * элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 */

public class Task15 {

	public static void main(String[] args) {

		int k = 10;

		int n = 100;

		mas(k, n);

	}

	public static void mas(int k, int n) {

		int m = 0;

		int b = 0;

		int sum = 0;

		int[] A = new int[n];

		for (int i = 0; i < A.length; i++) {

			if (m < n) {

				int h = m;

				while (h > 0) {

					b = h % 10;

					sum = sum + b;

					h = h / 10;

				}

				if (sum == k) {

					A[i] = m;

					System.out.print(A[i] + ", ");

				}

				sum = 0;

				m++;

			}

		}

	}

}
