package by.htp.arrays01.main;

import java.util.Random;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К

public class Task01 {

	public static void main(String[] args) {

		int N = 5;

		int[] mas = new int[N];
		
		int k = 2;

		int sum = 0;

		Random1(mas);
		print(mas);
		sum = masp(mas, k, sum);
		print2(mas, k, sum);

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

	public static int masp(int[] mas, int k, int sum) {// , int sum

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] % k == 0) {

				sum = sum + mas[i];

			}

		}

		return sum;
		
	}

	public static void print2(int[] mas, int k, int sum) {

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] % k == 0) {

				System.out.print(mas[i] + ", ");

			}

		}

		System.out.println();
		
		System.out.println("sum = " + sum);

	}

}
