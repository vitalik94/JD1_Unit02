package by.htp.arrays01.main;

import java.util.Random;

/* 
 * Дана последовательность действительных чисел a1, a2,.., an. 
 * Указать те ее элементы, которые принадлежат отрезку [с, d]. 
 */

public class Task15 {

	public static void main(String[] args) {

		int n = 10;

		int[] mas = new int[n];

		int c = -20;
		int d = 20;

		Random(mas);
		print(mas);
		mas(mas, c, d);

	}

	public static void Random(int[] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			mas[i] = rand.nextInt(100) - 50;

		}

	}

	public static void print(int[] mas) {

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + ", ");

		}

		System.out.println();

	}

	public static void mas(int[] mas, int c, int d) {

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > c & mas[i] < d) {

				System.out.print(mas[i] + ", ");

			}

		}

	}

}
