package by.htp.arrays01.main;

import java.util.Random;

/* 
 * Дана последовательность чисел а1 ,а2 ,..., ап. 
 * Указать наименьшую длину числовой оси, содержащую все эти числа. 	
 */

public class Task06 {

	public static void main(String[] args) {

		int N = 5;

		int[] mas = new int[N];

		int max = mas[0];

		Random1(mas);
		print(mas);
		max = numaxeslen(mas, max);
		numaxeslenP(mas, max);

	}

	public static void Random1(int[] mas) {

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

	public static int numaxeslen(int[] mas, int max) {

		for (int i = 1; i < mas.length; i++) {
			
			if (mas[i] > max) {
				
				max = mas[i];
				
			}
			
		}

		return max;

	}

	public static void numaxeslenP(int[] mas, int max) {

		System.out.println(max);
		
		System.out.println("длина числовой оси равна " + max);
		
	}

}
