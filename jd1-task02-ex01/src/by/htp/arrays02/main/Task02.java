package by.htp.arrays02.main;

import java.util.Random;

/* 
 * Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. 
 * Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей. 
 * Примечание. Дополнительный массив не использовать. 
 */

public class Task02 {

	public static void main(String[] args) {

		int n = 5;

		int[] mas1 = new int[n];

		int[] mas2 = new int[n];

		int[] mas3 = new int[mas1.length + mas2.length];

		int min = 0;

		int im = 0;

		mas(mas1, mas2);
		masInc(mas1, mas2, min, im);
		masN(mas1, mas2, mas3, min, im);
		print(mas1, mas2, mas3);

	}

	public static void mas(int[] mas1, int[] mas2) {

		Random rand = new Random();

		for (int i = 0 ; i < mas1.length ; i++) {

			mas1[i] = rand.nextInt(10);

		}

		for (int i = 0 ; i < mas2.length ; i++) {

			mas2[i] = rand.nextInt(10);

		}

	}

	public static void masInc(int[] mas1, int[] mas2, int min, int im) {

		for (int i = 0 ; i < mas1.length ; i++) {

			min = mas1[i];

			im = i;

			for (int j = i + 1 ; j < mas1.length ; j++) {

				if (min > mas1[j]) {

					min = mas1[j];

					im = j;

				}

			}

			mas1[im] = mas1[i];

			mas1[i] = min;

		}

		for (int i = 0 ; i < mas2.length ; i++) {

			min = mas2[i];

			im = i;

			for (int j = i + 1 ; j < mas2.length ; j++) {

				if (min > mas2[j]) {

					min = mas2[j];

					im = j;

				}

			}

			mas2[im] = mas2[i];

			mas2[i] = min;

		}

	}

	public static void masN(int[] mas1, int[] mas2, int[] mas3, int min, int im) {

		int j = 0;

		for (int i = 0 ; i < mas3.length ; i++) {

			if (i < 5) {

				mas3[i] = mas1[i];

			} else {

				mas3[i] = mas2[j];

				j++;

			}

		}

		for (int i = 0 ; i < mas3.length ; i++) {

			min = mas3[i];

			im = i;

			for (j = i + 1 ; j < mas3.length ; j++) {

				if (min > mas3[j]) {

					min = mas3[j];

					im = j;

				}

			}

			mas3[im] = mas3[i];

			mas3[i] = min;

		}

	}

	public static void print(int[] mas1, int[] mas2, int[] mas3) {

		for (int i = 0 ; i < mas1.length ; i++) {

			System.out.print(mas1[i] + ", ");

		}

		System.out.println();

		for (int i = 0 ; i < mas2.length ; i++) {

			System.out.print(mas2[i] + ", ");

		}

		System.out.println();

		for (int i = 0 ; i < mas3.length ; i++) {

			System.out.print(mas3[i] + ", ");

		}

	}

}
