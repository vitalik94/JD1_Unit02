package by.htp.arrays01.main;

import java.util.Random;

/* 
 * В целочисленной последовательности есть нулевые элементы. 
 * Создать массив из номеров этих элементов. 
 */

public class Task02 {

	public static void main(String[] args) {

		int n = 5;

		int[] mas = new int[n];

		Random1(mas);
		print(mas);
		mas1(mas);

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

	public static void mas1(int[] mas) {

		int m = 0;

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] == 0) {

				mas[m] = i;

				System.out.print(mas[m] + ", ");

				m = m + 1;

			}
		}
		
	}

}
