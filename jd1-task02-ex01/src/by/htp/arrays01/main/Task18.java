package by.htp.arrays01.main;

import java.util.Random;

/* 
 * «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в ряд ячеек, 
 * в которые надо вставить игральные кубики. Но дверь открывается только в том случае, 
 * когда в любых трех соседних ячейках сумма точек на передних гранях кубиков равна 10. 
 * (Игральный кубик имеет на каждой грани от 1 до 6 точек). Напишите программу, 
 * которая разгадывает код замка при условии, что два кубика уже вставлены в ячейки.
 */

public class Task18 {

	public static void main(String[] args) {

		int n = 10;

		int[] mas = new int[n];

		// int[] mas = new int[] { 5, 0, 5, 5, 0, 5, 5, 0, 5, 5 };

		int sum = 10;

		Random(mas);
		print(mas);
		sumCell(mas, sum);

	}

	public static void Random(int[] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			mas[i] = rand.nextInt(6);

		}

	}

	public static void print(int[] mas) {

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + ", ");

		}

		System.out.println();

	}

	public static void sumCell(int[] mas, int sum) {

		int sumi = 0;
		int a = 0;
		int b = 0;

		for (int i = 0; i < mas.length - 2;) {

			while (a < 3) {

				sumi = sumi + mas[i];

				i++;

				a++;

			}

			if (sum == sumi) {

				b++;

			}

			i = i - 2;

			sumi = 0;

			a = 0;

		}

		if (b == 8) {

			System.out.println("код замка сейфа разгадан");

		} else {

			System.out.println("код замка сейфа не разгадан");

		}

		System.out.println();

	}

}
