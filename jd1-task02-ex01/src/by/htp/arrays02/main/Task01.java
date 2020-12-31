package by.htp.arrays02.main;

/* 
 * Заданы два одномерных массива с различным количеством элементов и натуральное число k. 
 * Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами  первого, 
 * при этом не используя дополнительный массив. 
 */

public class Task01 {

	public static void main(String[] args) {

		int[] mas1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int[] mas2 = { 11, 12, 13, 14, 15 };

		int k = 5;

		int[] mas3 = new int[mas1.length + mas2.length];

		mas(mas1, mas2, mas3, k);

		printMas(mas1, mas2, mas3);

	}

	public static void printMas(int[] mas1, int[] mas2, int[] mas3) {

		for (int i = 0; i < mas1.length; i++) {

			System.out.print(mas1[i] + ", ");

		}

		System.out.println();

		for (int i = 0; i < mas2.length; i++) {

			System.out.print(mas2[i] + ", ");

		}

		System.out.println();

		for (int i = 0; i < mas3.length; i++) {

			System.out.print(mas3[i] + ", ");

		}

		System.out.println();

	}

	public static void mas(int[] mas1, int[] mas2, int[] mas3, int k) {

		int j = 0;
		int n = 0;

		for (int i = 0; i < mas3.length; i++) {

			if (i < k || i > k + 4) {

				mas3[i] = mas1[j];

				j++;

			} else {

				if (n < 5) {

					mas3[i] = mas2[n];

					n++;

				}

			}

		}

	}

}
