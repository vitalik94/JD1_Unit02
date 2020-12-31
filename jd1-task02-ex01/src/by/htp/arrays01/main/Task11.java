package by.htp.arrays01.main;

import java.util.Random;

/* 
 * Даны натуральные числа а1 ,а2 ,..., аn. 
 * Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1). 
 */

public class Task11 {

	public static void main(String[] args) {

		int n = 5;

		int[] mas = new int[n];

		int m = 5;

		int l = 0;

		Random(mas);
		print(mas);
		rem(mas, m, l);

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

	public static void rem(int[] mas, int m, int l) {

		for (int i = 0; i < mas.length; i++) {

			l = mas[i] % m;

			if (l > 0 & l < (m - 1)) {

				System.out.print(mas[i] + ", ");

			}

		}

	}

}
