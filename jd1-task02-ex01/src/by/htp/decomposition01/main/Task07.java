package by.htp.decomposition01.main;

import java.util.Random;

/*  
 * На плоскости заданы своими координатами n точек. 
 * Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние. 
 * Указание. Координаты точек занести в массив. 
 */

public class Task07 {

	public static void main(String[] args) {

		int n = 6;

		int[] mas = new int[n];

		int ab = 0;
		int bc = 0;
		int ca = 0;

		Random1(mas);
		print(mas);
		coordinatesP(mas, ab, bc, ca);

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

	public static void coordinatesP(int[] mas, int ab, int bc, int ca) {

		for (int i = 0; i < mas.length; i++) {

			ab = (int) Math.sqrt(Math.pow((mas[2] - mas[0]), 2) + Math.pow((mas[3] - mas[1]), 2));
			bc = (int) Math.sqrt(Math.pow((mas[4] - mas[2]), 2) + Math.pow((mas[5] - mas[3]), 2));
			ca = (int) Math.sqrt(Math.pow((mas[4] - mas[0]), 2) + Math.pow((mas[5] - mas[1]), 2));

		}

		if (ab > bc & ab > ca) {

			System.out.println("расстояние больше между точками ab");

		} else if (bc > ab & bc > ca) {

			System.out.println("расстояние больше между точками bc");

		} else {

			System.out.println("расстояние больше между точками ca");

		}

	}

}
