package by.htp.arrays03.main;

import java.util.Random;

// Дана матрица. Вывести на экран первую и последнюю строки

public class Task04 {

	public static void main(String[] args) {
		
		int [][] mas = new int [3][4];
		
		Random rand = new Random();
		
		for(int i = 0; i < mas.length; i++) {
			
			for(int j = 0; j < mas[i].length; j++) {
				
				mas[i][j] = rand.nextInt(10);
				
			}
			
		}
		
		for(int i = 0; i < mas.length; i++) {
			
			for(int j = 0; j < mas[i].length; j++) {
				
				System.out.printf("mas[%d][%d] = %-6d",i,j,mas[i][j]);
				
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		

			
			for(int j = 0; j < mas[0].length;) {
				
				System.out.printf("mas[%d][%d] = %-6d",0,j+1,mas[0][j]);
				j++;
				
			}
			
			System.out.println();
			
		
		
		System.out.println();
		

			
			for(int j = 0; j < mas[2].length;) {
				
				System.out.printf("mas[%d][%d] = %-6d",2,j,mas[2][j]);
				j++;
				
			}
			
			System.out.println();

	}

}
