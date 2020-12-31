package by.htp.arrays03.main;

import java.util.Random;
import java.util.Scanner;

/*
 * В числовой матрице поменять местами два столбца любых столбца, 
 * т.е. все элементы одного столбца поставить на соответствующие им позиции другого, 
 * а его элементы второго переместить в первый. 
 * Номера столбцов вводит пользователь с клавиатуры. 
 */

public class Task27 {

	public static void main(String[] args) {

		int n = 3;
		int m = 4;

		int[][] mas = new int[n][m];

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int t = 0;

		Random(mas);
		print(mas);
		mas(mas, a, b, t, m);
		print(mas);

	}

	public static void Random(int[][] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = rand.nextInt(10);

			}

		}

	}

	public static void print(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("mas[%d][%d] = %-6d", i, j, mas[i][j]);

			}

			System.out.println();

		}

		System.out.println();

	}

	public static void mas(int[][] mas, int a, int b, int t, int m) {

		if (a < m & b < m) {

			for (int i = 0; i < mas.length; i++) {

				t = mas[i][a];

				mas[i][a] = mas[i][b];

				mas[i][b] = t;

			}

		} else {

			System.out.println("Введено неверное значение");

		}

	}

}
