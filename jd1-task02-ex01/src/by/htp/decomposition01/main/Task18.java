package by.htp.decomposition01.main;

/* Найти все натуральные n-значные числа, цифры в которых образуют 
 * строго возрастающую последовательность (например, 1234, 5789). 
 * Для решения задачи использовать декомпозицию. 
 */

public class Task18 {

	public static void main(String[] args) {

		int n = 0;
		int m = 0;
		int a = 1;
		int b = 0;
		int i = 0;
		int k = 0;

		num(n, m, a, b, i, k);

	}

	public static void num(int n, int m, int a, int b, int i, int k) {

		int x;
		int y;
		int c;
		int sum = 0;

		for (; n <= 10000; n++) {

			x = n;

			while (x > 0) {

				y = x / 10;

				c = x - (y * 10);

				sum = (sum + c) * 10;

				x = y;

				k++;

			}

			m = sum / 10;

			b = (m % 10) - 1;

			sum = 0;

			while (m > b) {

				a = m % 10;

				if (a - b == 1) {

					i++;

				}

				b = a;

				m = (m - a) / 10;

			}

			if (i == k) {

				if (n > 9) {

					System.out.println(n);

				}
			}

			i = 0;

			k = 0;

		}

	}

}
