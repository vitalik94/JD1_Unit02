package by.htp.arrays01.main;

import java.util.Random;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К

public class Task01 {
	
	public static void main(String[] args) {
		
		int N = 5;
		
		int[] mas = new int[N];
		int sum = 0;
	
		Random1(mas);
		print(mas);
		sumi(mas,sum);
		
	}
	
	public static void Random1(int[] mas) {
		
		Random rand = new Random();
		
		for (int i = 0 ; i < mas.length ; i++ ) {
			
			mas[i] = rand.nextInt(1000);
		}
		
	}
	
	public static void print(int[] mas) {
		
		for (int i = 0 ; i < mas.length ; i++ ) {
			
			System.out.print(mas[i] + ", ");
		}
		System.out.println();
	}
	
	public static int sumi(int[] mas, int sum) {
		
		int k = 2;
		
		for (int i = 0 ; i < mas.length ; i++ ) {
		if ( mas[i] % k == 0 ) {
			
			System.out.print(mas[i] + ", ");
			sum = sum + mas[i];
			
		}
		}
		System.out.println();
		System.out.println("sum = " + sum);
		return sum;
	}

}
