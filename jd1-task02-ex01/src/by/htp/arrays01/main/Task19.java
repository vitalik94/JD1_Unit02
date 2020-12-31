package by.htp.arrays01.main;

import java.util.Random;

/* 
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
 * Если таких чисел несколько, то определить наименьшее из них. 
 */

public class Task19 {

	public static void main(String[] args) {

		int n = 5;

		int[] mas = new int[n];

		Random(mas);
		print(mas);
		mas(mas);

	}

	public static void Random(int[] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			mas[i] = rand.nextInt(10);

		}

	}

	public static void print(int[] mas) {

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + ", ");

		}

		System.out.println();

	}

	public static void mas(int[] mas) {

		int b = 10;

		int k = 0;

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas.length; j++) {

				if (mas[i] == mas[j]) {

					k++;

				}

			}

			if (k > 1) {

				if (mas[i] < b) {

					b = mas[i];

				}

			}

			k = 0;

		}

		if (b != 10) {

			System.out.println(b);

		} else {

			System.out.println();

		}

	}

}
