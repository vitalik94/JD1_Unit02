package by.htp.arrays01.main;

import java.util.Random;

/* 
 * Даны действительные числа а1 ,а2 ,..., аn. 
 * Поменять местами наибольший и наименьший элементы.
 */

public class Task09 {

	public static void main(String[] args) {

		int[] mas = { 1, 2, 3, 4, 5 };

		Random1(mas);
		print(mas);
		maxmin(mas);
		print2(mas);

	}

	public static void Random1(int[] mas) {

		for (int i = 0; i < mas.length; i++) {

		}

	}

	public static void print(int[] mas) {

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + ", ");

		}

		System.out.println();

	}

	public static void maxmin(int[] mas) {

		int max = mas.length - 1;

		int min = 0;

		int a = 0;

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] < mas[min]) {

				mas[min] = mas[i];

			}

			if (mas[i] > mas[max]) {

				mas[max] = mas[i];

			}

		}

		a = mas[min];
		mas[min] = mas[max];
		mas[max] = a;

	}

	public static void print2(int[] mas) {

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + ", ");

		}

	}

}
