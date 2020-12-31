package by.htp.arrays01.main;

import java.util.Random;

/* 
 * Дана последовательность целых чисел а1 а2,..., аn. 
 * Выяснить, какое число встречается раньше - положительное или отрицательное.
 */

public class Task03 {
	
	public static void main(String[] args) {
		
		int n = 5;
		
		int[] mas = new int[n];
		
		Random1(mas);
		print(mas);
		mas2(mas);


	}
	
	public static void Random1(int[] mas) {
		
		Random rand = new Random();
		
		for (int i = 0 ; i < mas.length ; i++ ) {
			
			mas[i] = rand.nextInt(10)-5;
		}
		
	}
	
	public static void print(int[] mas) {
		
		for (int i = 0 ; i < mas.length ; i++ ) {
			
			System.out.print(mas[i] + ", ");
			
		}
		
		System.out.println();
		
	}
	
	public static void mas2(int[] mas) {
		
		for (int i = 0 ; i < mas.length ; i++) {
			
			if (mas[i] > 0) {
				
				System.out.println(mas[i] + " положительное раньше");
				
			}else if (mas[i] < 0) {
				
				System.out.println(mas[i] + " отрицательное раньше");
				
			}else {
				
				System.out.println(mas[i]);
				
			}
			//break;
		}
	}

}
