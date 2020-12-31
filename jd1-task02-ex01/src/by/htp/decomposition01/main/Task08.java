package by.htp.decomposition01.main;

/* 
 * Составить программу, которая в массиве A[N] находит второе по величине число
 * (вывести на печать число, которое меньше максимального элемента массива, 
 * но больше всех других элементов). 
 */

public class Task08 {

	public static void main(String[] args) {

		int[] mas = new int[] { 1, 52, 2, 47, 32, 45, 87, 97, 42, 34 };

		int max = mas[0];

		int masi = mas[0];

		mas(mas);
		masi = maxN(mas, max, masi);
		maxP(mas, masi);

	}

	public static void mas(int[] mas) {

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + ",");

		}

		System.out.println();

	}

	public static int maxN(int[] mas, int max, int masi) {

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > max) {

				max = mas[i];

			}

		}

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > masi & mas[i] < max) {

				masi = mas[i];

			}

		}

		return masi;

	}

	public static void maxP(int[] mas, int masi) {

		System.out.println(masi);

	}

}
