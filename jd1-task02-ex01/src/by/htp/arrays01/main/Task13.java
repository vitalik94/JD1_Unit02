package by.htp.arrays01.main;

import java.util.Random;

/* 
 * Определить количество элементов последовательности натуральных чисел, 
 * кратных числу М и заключенных в промежутке от L до N.
 */

public class Task13 {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		int[] mas = new int[a];
		
		int m = 2;
		
		int l = 10;
		
		int n = 20;
		
		int k = 0;
		
		Random(mas);
		print(mas);
		k = mas(mas, m, l, n, k);
		masP(mas, m, l, n, k);
	}
	
	public static void Random(int[] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {

			mas[i] = rand.nextInt(100);

		}

	}

	public static void print(int[] mas) {

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + ", ");

		}

		System.out.println();
		
	}

	public static int mas(int[] mas, int m, int l, int n, int k) {

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] % m == 0 & mas[i] >= l & mas[i] <= n) {

				k++;

			}

		}

		return k;
		
	}
	
	public static void masP(int[] mas, int m, int l, int n, int k) {

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] % m == 0 & mas[i] > l & mas[i] < n) {

				System.out.print(mas[i] + ", ");

			}

		}
		
		System.out.println();
		System.out.println(k);
		
	}

}
