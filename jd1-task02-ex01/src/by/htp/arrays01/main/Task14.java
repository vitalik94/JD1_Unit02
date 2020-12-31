package by.htp.arrays01.main;

import java.util.Random;

// Дан одномерный массив A[N]. Найти: max(a2,a4,...,a2k) + min(a1,a3,...,a2k+1) 

public class Task14 {

	public static void main(String[] args) {

		int n = 10;

		int[] mas = new int[n];

		int sum = 0;

		Random(mas);
		print(mas);
		mas(mas, sum);
		// masP(mas, max, min, sum);

	}

	public static void Random(int[] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			mas[i] = rand.nextInt(100);

		}

	}

	public static void print(int[] mas) {

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + ", ");

		}

		System.out.println();

	}

	public static void mas(int[] mas, int sum) {

		int max = mas.length - 1;

		int min = mas[0];

		for (int i = 0; i < mas.length; i++) {

			if (i % 2 == 0 & mas[i] > max) {

				max = mas[i];

			}

		}

		for (int i = 0; i < mas.length; i++) {

			if (i % 2 != 0 & mas[i] < min) {

				min = mas[i];

			}

		}

		System.out.println(max);

		System.out.println(min);

		sum = max + min;

		System.out.println(sum);

		// return sum;

	}

	/*
	 * public static void masP(int[] mas, int max, int min, int sum) {
	 * 
	 * for (int i = 0; i < mas.length; i++) {
	 * 
	 * if (mas[i] % 2 == 0 & mas[i] > max) {
	 * 
	 * System.out.println(max);
	 * 
	 * }
	 * 
	 * if(mas[i] % 2 != 0 & mas[i] < min) {
	 * 
	 * System.out.println(min);
	 * 
	 * }
	 * 
	 * }
	 * 
	 * System.out.println(sum);
	 * 
	 * }
	 */

}
