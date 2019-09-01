package by.htp.arrays01.main;

import java.util.Random;

/* ƒана последовательность действительных чисел а1 ,а2 ,..., ап.
 * «аменить все ее члены, большие данного Z, этим числом.
 * ѕодсчитать количество замен
 */

public class Task07 {

	public static void main(String[] args) {
		
		int n = 5;
		
		int[] mas = new int[n];
		
		Random1(mas);
		print(mas);
		numofrep(mas);

	}
	
	public static void Random1(int[] mas) {
		
		Random rand = new Random();
		
		for (int i = 0 ; i < mas.length ; i++ ) {
			
			mas[i] = rand.nextInt(10);
		}
		
	}
	
	public static void print(int[] mas) {
		
		for (int i = 0 ; i < mas.length ; i++ ) {
			
			System.out.print(mas[i] + ", ");
		}
		System.out.println();
	}
	
	
	public static void numofrep(int[] mas) {
		
		int z = 5;
		int m = 0;
		for (int i = 0 ; i < mas.length ; i++ ) {
			
			if (mas[i]>z) {
				
				mas [i] = z;

				m = m + 1;
				
			}else {
		
			}
		}

		for (int i = 0 ; i < mas.length ; i++ ) {
			
			if (mas[i]>z) {
				
				System.out.print(mas[i] + ", ");
				
			}else {
				System.out.print(mas[i] + ", ");
			}
		}
		System.out.println();
		System.out.print("количество замен - " + m);
	
	}
	
	}


