package by.htp.decomposition01.main;

import java.util.Random;

/* 
 * Задан массив D. Определить следующие суммы: 
 * D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. 
 * Пояснение. Составить метод(методы) для вычисления суммы 
 * трех последовательно расположенных элементов массива с номерами от k до m. 
 */

public class Task11 {
	
	public static void main(String[] args) {
		
		int n = 7;
		
		int[] D = new int[n];
		
		Random1(D);
		print(D);
		sumM(D);
	}
	
	public static void Random1(int[] D) {

		Random rand = new Random();

		for (int i = 0; i < D.length; i++) {

			D[i] = rand.nextInt(10);

		}

	}

	public static void print(int[] D) {

		for (int i = 0; i < D.length; i++) {

			System.out.print(D[i] + ", ");

		}

		System.out.println();
		
	}
	
	public static void sumM(int[] D) {
		
		int sum;
		
		int b = 0;
		
		for(int i = 0; i < D.length-1; i++) {
			
			if(b < 4 & b != 1) {
			
			sum = D[i+1] + D[i+2] + D[i+3];
			
			System.out.println(sum);
			
			}
			
			b++;
			
		}
		
	}

}
