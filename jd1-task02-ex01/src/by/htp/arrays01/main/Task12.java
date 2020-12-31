package by.htp.arrays01.main;

import java.util.Random;

/* 
 * Задана последовательность N вещественных чисел. 
 * Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */

public class Task12 {

	public static void main(String[] args) {

		int n = 10;

		double[] mas = new double[n];

		double sum = 0;

		Random(mas);
		print(mas);
		sum = sum(mas, sum);
		sumP(mas, sum);

	}

	public static void Random(double[] mas) {

		Random rand = new Random();

		int a;

		for (int i = 0; i < mas.length; i++) {

			a = rand.nextInt(10);

			mas[i] = a + rand.nextDouble();

		}

	}

	public static void print(double[] mas) {

		for (int i = 0; i < mas.length; i++) {

			System.out.printf("%.2f  ", mas[i]);

		}

		System.out.println();

	}

	public static double sum(double[] mas, double sum) {

		int b = 0;

		for (int i = 0; i < mas.length; i++) {

			for (int j = 1; j < 10; j++) {

				if (i % j == 0) {// & i != 0 & i != 1

					b++;

				} else if (i == 0) {

					b = 3;

				} else if (i == 1) {

					b = 3;

				}

			}

			if (b <= 2) {

				sum = sum + mas[i];
				System.out.printf("%.2f  ", mas[i]);
			}

			b = 0;

		}

		return sum;

	}

	public static void sumP(double[] mas, double sum) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 1; j < 10; j++) {

				if (i % j == 0) {// & i != 0 & i != 1

				} else if (i == 0) {

					// System.out.println("");

				} else if (i == 1) {

					// System.out.println("");

				}

			}

		}

		System.out.println();

		System.out.printf("%.2f", sum);

	}

}
