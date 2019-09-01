package by.htp.arrays03.main;

import java.util.Random;

//Дана матрица. Вывести на экран первый и последний столбцы. 

public class Task03 {

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
		
		for(int i = 0; i < mas.length; i++) {
			
			for(int j = 0; j < mas[i].length; ) {
				
				System.out.printf("mas[%d][%d] = %-6d",i+1,0,mas[i][0]);
				break;
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		
		for(int i = 0; i < mas.length; i++) {
			
			for(int j = 0; j < mas[i].length; ) {
				
				System.out.printf("mas[%d][%d] = %-6d",i+1,3,mas[i][3]);
				break;
			}
			
			System.out.println();
			
		}


	}

}
