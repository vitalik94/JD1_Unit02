package by.htp.arrays01.main;

import java.util.Random;

/* 
 * Дана последовательность целых чисел a1,a2,...,an. Образовать новую последовательность, 
 * выбросив из исходной те члены, которые равны min(a1,a2,...,an).
 */

public class Task17 {

	public static void main(String[] args) {

		int n = 10;

		int[] mas = new int[n];

		// int min = mas[0];

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

		int min = mas[0];

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] < min) {

				min = mas[i];

			}

		}

		System.out.println(min);

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] != min) {

				System.out.print(mas[i] + ", ");

			}

		}

	}

}
