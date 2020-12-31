package by.htp.arrays02.main;

import java.util.Random;

/*
 * Сортировка вставками. Дана последовательность чисел a1,a2,...,an. 
 * Требуется переставить числа в порядке возрастания. Делается это следующим образом. 
 * Пусть a1,a2,...,ai - упорядоченная последовательность, т.е. a1 <= a2 <= ... <= an. 
 * Берется следующее число ai+1 и вставляется в последовательность так, 
 * чтобы новая nпоследовательность была тоже возрастающей. Процесс производится до тех пор, 
 * пока все элементы от i + 1 до n не будут перебраны. Примечание. 
 * Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска. 
 * Двоичный поиск оформить в виде отдельной функции. 
 */

public class Task05 {

	public static void main(String[] args) {

		int n = 10;

		int[] mas = new int[n];

		Random(mas);
		print(mas);
		sortIns(mas);
		print(mas);

	}

	public static void Random(int[] mas) {

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

	public static void sortIns(int[] mas) {

		for (int i = 0; i < mas.length; i++) {

			int h = mas[i];

			int j = i - 1;

			for (; j >= 0; j--) {

				if (h < mas[j]) {

					mas[j + 1] = mas[j];

				} else {

					break;

				}

			}

			mas[j + 1] = h;

		}

	}

}
