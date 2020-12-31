package by.htp.arrays01.main;

import java.util.Random;

/* 
 * Дана последовательность действительных чисел а1 а2 ,..., аn. 
 * Выяснить, будет ли она возрастающей. 
 */

public class Task04 {

	public static void main(String[] args) {

		// int n = 5;

		int[] mas = new int[] { 0, 1, 2, 3, 4 };

		int n = 0;
		int m = 0;

		// Random1(mas);
		print(mas);
		m = main2(mas, n);
		print2(mas, m);

	}

	/*
	 * public static void Random1(int[] mas) { Random rand = new Random();
	 * 
	 * for (int i = 0 ; i < mas.length ; i++ ) { mas[i] = rand.nextInt(5);
	 * 
	 * }
	 * 
	 * }
	 */

	public static void print(int[] mas) {

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + ", ");
		}
		System.out.println();
	}

	public static int main2(int[] mas, int n) {

		for (int i = 0; i < mas.length - 1; i++) {

			if (mas[i] < mas[i + 1]) {

				n++;

			}
			// break;
		}

		return n;

		/*
		 * if(a == false) {
		 * 
		 * System.out.println("������������������ �� ������������");
		 * 
		 * }else {
		 * 
		 * System.out.println("������������������ ������������");
		 * 
		 * }
		 */
	}

	public static void print2(int[] mas, int m) {

		if (m == 4) {

			System.out.println("последовательность возрастающая");

		} else {

			System.out.println("последовательность не возрастающая");

		}

	}

}
