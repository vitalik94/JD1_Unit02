package by.htp.arrays03.main;

import java.util.Random;

/*
 * С клавиатуры вводится двумерный массив чисел размерностью n x m. 
 * Выполнить с массивом следующие действия:  
 * а) вычислить сумму отрицательных элементов в каждой строке;  
 * б) определить максимальный элемент в каждой строке;  
 * в) переставить местами максимальный и минимальный элементы матрицы. 
 */

public class Task26 {

	public static void main(String[] args) {

		int n = 3;
		int m = 4;

		int[][] mas = new int[n][m];

		int sum = 0;

		int min = mas[0][0];
		int max = mas[0][0];
		int imax = 0;
		int jmax = 0;
		int imin = 0;
		int jmin = 0;
		int a = 0;

		Random(mas);
		printR(mas);
		masSum(mas, sum);
		masMax(mas, max);
		masMaxMin(mas, min, max, imax, jmax, imin, jmin, a);
		printR(mas);

	}

	public static void Random(int[][] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = rand.nextInt(20) - 10;

			}

		}

	}

	public static void printR(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("mas[%d][%d] = %-6d", i, j, mas[i][j]);

			}

			System.out.println();

		}

		System.out.println();

	}

	public static void masSum(int[][] mas, int sum) {

		for (int i = 0; i < mas.length; i++) {

			sum = 0;

			for (int j = 0; j < mas[i].length; j++) {

				if (mas[i][j] < 0) {

					sum = sum + mas[i][j];

				}

			}

			System.out.println("Сумма отрицательных элементов в строке " + i + ": sum = " + sum);

		}

		System.out.println();

	}

	public static void masMax(int[][] mas, int max) {

		for (int i = 0; i < mas.length; i++) {

			max = mas[i][0];

			for (int j = 0; j < mas[i].length; j++) {

				if (max < mas[i][j]) {

					max = mas[i][j];

				}

			}

			System.out.println("Max элемент в строке " + i + ": max = " + max);

		}

		System.out.println();

	}

	public static void masMaxMin(int[][] mas, int min, int max, int imax, int jmax, int imin, int jmin, int a) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				if (min > mas[i][j]) {

					min = mas[i][j];

					imin = i;
					
					jmin = j;

				}

				if (max < mas[i][j]) {

					max = mas[i][j];

					imax = i;
					
					jmax = j;

				}

			}

		}

		a = mas[imin][jmin];
		mas[imin][jmin] = mas[imax][jmax];
		mas[imax][jmax] = a;

	}

}
