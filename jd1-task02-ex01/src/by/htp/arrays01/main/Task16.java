package by.htp.arrays01.main;

import java.util.Random;

//Даны действительные числа a1,a2,...,a2n. Найти max(a1 +a2n, a2 +a2n−1,...,an+an+1). 

public class Task16 {

	public static void main(String[] args) {

		int n = 10;

		int[] masi = new int[2 * n];

		int a = masi.length - 1;

		int[] masj = new int[n];

		int max = masj[0];

		Random(masi);
		print(masi);
		mas(masi, masj, a, n, max);

	}

	public static void Random(int[] masi) {

		Random rand = new Random();

		for (int i = 0; i < masi.length; i++) {

			masi[i] = rand.nextInt(10);

		}

	}

	public static void print(int[] masi) {

		for (int i = 0; i < masi.length; i++) {

			System.out.print(masi[i] + ", ");

		}

		System.out.println();

	}

	public static void mas(int[] masi, int[] masj, int a, int n, int max) {

		for (int i = 0; i < masi.length; i++) {

			for (int j = 0; j < masj.length; j++) {

				if (i < n) {

					masj[j] = masi[i++] + masi[a--];

					System.out.print(masj[j] + ", ");

				}

				if (max < masj[j]) {

					max = masj[j];

				}

			}

		}

		System.out.println();

		System.out.println(max);

	}

}
