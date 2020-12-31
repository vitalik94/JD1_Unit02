package by.htp.arrays01.main;

import java.util.Random;

/* 
 * Дана последовательность действительных чисел а1 ,а2 ,..., аn. 
 * Заменить все ее члены, большие данного Z, этим числом. 
 * Подсчитать количество замен. 
 */

public class Task07 {

	public static void main(String[] args) {

		int n = 5;

		int[] mas = new int[n];

		int z = 5;

		int m = 0;

		Random1(mas);
		print(mas);
		m = numOfRep(mas, z, m);
		numOfRepP(mas, z, m);

	}

	public static void Random1(int[] mas) {

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

	public static int numOfRep(int[] mas, int z, int m) {

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > z) {

				mas[i] = z;

				m = m + 1;

			}

		}

		return m;

	}

	public static void numOfRepP(int[] mas, int z, int m) {

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > z) {

				System.out.print(mas[i] + ", ");

			} else {

				System.out.print(mas[i] + ", ");

			}

		}

		System.out.println();

		System.out.print("количество замен- " + m);

	}

}
