package by.htp.arrays01.main;

import java.util.Random;

/* 
 * Дана последовательность натуральных чисел а1 , а2 ,..., ап. 
 * Создать массив из четных чисел этой последовательности. 
 * Если таких чисел нет, то вывести сообщение об этом факте
 */

public class Task05 {

	public static void main(String[] args) {

		int n = 5;

		int[] mas = new int[n];

		int j = 0;

		Random1(mas);
		print(mas);
		mas(mas, j);

	}

	public static void Random1(int[] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			mas[i] = rand.nextInt(5);
		}

	}

	public static void print(int[] mas) {

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + ", ");
		}
		System.out.println();
	}

	public static void mas(int[] mas, int j) {

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] % 2 == 0 & mas[i] > 0) {

				mas[j] = mas[i];

				System.out.print(mas[j] + ", ");

				j++;

			}

		}

		if (j == 0) {

			System.out.println("четных чисел нет");

		}

	}

}
