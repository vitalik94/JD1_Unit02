package by.htp.decomposition01.main;

/* 
 * Написать программу, определяющую сумму n - значных чисел, 
 * содержащих только нечетные цифры. Определить также, 
 * сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

public class Task19 {

	public static void main(String[] args) {

		int n = 10;
		int a = 0;
		int b = 0;
		int sum = 0;
		int i = 0;
		int k = 0;
		int x = 0;
		int y = 0;
		int j = 0;

		sum(n, a, b, sum, i, k, x, y, j);

	}

	public static void sum(int n, int a, int b, int sum, int i, int k, int x, int y, int j) {

		for (; n < 1000; n++) {

			a = n;

			while (a > 0) {

				b = a % 10;

				k++;

				if (b % 2 != 0) {

					sum = sum + b;

					i++;

				} else {

					break;

				}

				a = (a - b) / 10;

			}

			x = sum;

			while (x > 0) {

				y = x % 10;

				if (y > 0) {

					if (y % 2 == 0) {

						j++;

					}
				}
				x = (x - y) / 10;

			}

			if (i == k) {

				System.out.print(n + ", сумма цифр " + sum);

				if (j > 0) {

					System.out.print(", количество четных цифр в сумме " + j);

				}

				System.out.println();

			}

			sum = 0;

			i = 0;

			k = 0;

			j = 0;

		}

	}

}
