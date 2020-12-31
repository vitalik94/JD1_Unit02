package by.htp.arrays01.main;

import java.util.Random;

/* 
 * Дан целочисленный массив с количеством элементов n. Сжать массив, 
 * выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). 
 * Примечание. Дополнительный массив не использовать.
 */

public class Task20 {

	public static void main(String[] args) {

		int n = 10;

		int[] mas = new int[n];

		int i = 0;

		Random(mas);
		print(mas);
		mas(mas, i);
		// masP(mas, i);

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

	public static void mas(int[] mas, int i) {

		for (i = 0; i < mas.length; i++) {

			if (i % 2 != 0) {

				mas[i] = 0;

			}
			
			System.out.print(mas[i] + ", ");
			
		}
		
		System.out.println();
		
		int a = 0;
		
		for(i = 0; i > mas.length ; i++) {
			
			if(i % 2 != 0 & mas[i] == 0) {
				
				a = mas[i];	
			
				mas[i] = mas[i + 1];
				
				mas[i + 1]=a;
				
				System.out.print(mas[i] + ", ");
					
			}
			//a = mas[i];	
			//a = a + 1;
			
			//mas[i] = mas[i + 1];
			
			//mas[i + 1]=a;
			
		//	}
			
			//System.out.print(mas[i] + ", ");
			
		}

	}

	/*
	 * public static void masP(int[] mas, int i) {
	 * 
	 * for (i = 0; i < mas.length; i++) {
	 * 
	 * System.out.print(mas[i] + ", ");
	 * 
	 * }
	 * 
	 * }
	 */

}
