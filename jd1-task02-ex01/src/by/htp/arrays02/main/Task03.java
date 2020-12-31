package by.htp.arrays02.main;

import java.util.Random;

/* 
 * Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an .
 * Требуется переставить элементы так, чтобы они были расположены по убыванию. 
 * Для этого в массиве, начиная с первого, выбирается наибольший элемент 
 * и ставится на первое место, а первый - на место наибольшего. 
 * Затем, начиная со второго, эта процедура повторяется. 
 * Написать алгоритм сортировки выбором. 
 */

public class Task03 {
	
	public static void main(String[] args) {
		
		int n = 10;
		
		int[] mas = new int[n];
		
		int max = 0;
		int indexMax = 0;
		
		Random(mas);
		print(mas);
		sortSel(mas, max, indexMax);
		//print(mas);
		
	}
	
	public static void Random(int[] mas) {

		Random rand = new Random();

		for (int i = 0 ; i < mas.length ; i++) {

			mas[i] = rand.nextInt(10);

		}

	}
	
	public static void print(int[] mas) {

		for (int i = 0 ; i < mas.length ; i++) {

			System.out.print(mas[i] + ", ");

		}
		
		System.out.println();

	}
	
	public static void sortSel(int[] mas, int max, int indexMax) {
		
		for(int i = 0 ; i < mas.length ; i++) {
			
			max = mas[i];
			
			indexMax = i;
			
			for(int j = i + 1 ; j < mas.length ; j++) {
				
				if(max < mas[j]) {
					
					max = mas[j];
					
					indexMax = j;
					
				}
				
			}		
			
			mas[indexMax] = mas[i];
			
			mas[i] = max;
			
			print(mas);
			
		}
		
	}

}
