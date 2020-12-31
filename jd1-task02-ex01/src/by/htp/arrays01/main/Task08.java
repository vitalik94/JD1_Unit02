package by.htp.arrays01.main;

import java.util.Random;

/* 
 * Дан массив действительных чисел, размерность которого N. 
 * Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.  
 */

public class Task08 {

	public static void main(String[] args) {

		int n = 10;

		int[] mas = new int[n];

		Random1(mas);
		print(mas);
		numOfRep(mas);

	}

	public static void Random1(int[] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			mas[i] = rand.nextInt(20) - 10;

		}

	}

	public static void print(int[] mas) {

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + ", ");

		}

		System.out.println();

	}

	public static void numOfRep(int[] mas) {

		int x = 0;
		int y = 0;
		int z = 0;

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > 0) {

				x = x + 1;

			} else if (mas[i] < 0) {

				y = y + 1;

			} else {

				z = z + 1;

			}

		}

		System.out.println(x + " положительных чисел");

		System.out.println(y + " отрицательных чисел");

		System.out.println(z + " нулей");

	}

}
