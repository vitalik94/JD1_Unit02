package by.htp.arrays02.main;

import java.util.Random;

/* 
 * Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ... <= an.
 * Требуется переставить числа в порядке возрастания. 
 * Для этого сравниваются два соседних числа  ai и a(i+1) . 
 * Если  ai >= ai+1, то делается перестановка. 
 * Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания. 
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок. 
 */

public class Task04 {
	
	public static void main(String[] args) {
		
		int n = 10;
		
		int[] mas = new int[n];
		
		Random(mas);
		print(mas);
		sortExch(mas);
		print(mas);
		
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
	
	public static void sortExch(int[] mas) {
		
		//boolean h = false;
		
		//while(!h) {
			
		//h = true;
		for(int i = 0 ; i < mas.length ; i++) {
			
			for(int j = 0 ; j < mas.length - 1 ; j++) {
				
				if(mas[j] > mas[j + 1]) {
					
					int temp;
					temp = mas[j];
					mas[j] = mas[j + 1];
					mas[j + 1] = temp;
					
					//h = false;
					
				}
				print(mas);
			}
			System.out.println("------------");
		}
		
	}

}
