package by.htp.arrays03.main;

import java.util.Random;

/* 
 * Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, 
 * чтобы в одной строке была ровно одна единица, и вывести на экран. 
 */

public class Task01 {

	public static void main(String[] args) {
		
		int [][] mas = new int [3][3];
		
		Random(mas);
		masP(mas);
		print(mas);

	}
	
	public static void Random(int[][] mas) {
		
		Random rand = new Random();
		
		for(int i = 0; i < mas.length; i++) {
			
			for(int j = 0; j < mas[i].length; j++) {
				
				mas[i][j] = rand.nextInt(2);
				
			}
			
		}
		
		
	}
	
	public static void print(int[][] mas) {
		
		for(int i = 0; i < mas.length; i++) {
			
			for(int j = 0; j < mas[i].length; j++) {
				
				System.out.printf("mas[%d][%d] = %-6d",i,j,mas[i][j]);
				
			}
			
			System.out.println();
			
		}
		
	}
	
	public static void masP(int[][] mas) {
		
		for(int i = 0; i < mas.length; i++) {
			
			for(int j = 0; j < mas[i].length; j++) {
				
				mas[i][j]=(j==0)?1:0;
				
			}
			
		}
		
	}

}
