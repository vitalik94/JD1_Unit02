package by.htp.arrays01.main;

import java.util.Random;

 
// Даны целые числа а1, а2,..., аn. Вывести на печать только те числа, для которых аi > i.
 

public class Task10 {

	public static void main(String[] args) {

		int N = 5;

		int[] mas = new int[N];

		Random1(mas);
		print(mas);
		mas2(mas);

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

	public static void mas2(int[] mas) {

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > i) {

				System.out.print(mas[i] + ", ");

			}

		}

	}

}
