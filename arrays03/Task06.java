package by.htp.arrays03.main;

import java.util.Random;

//���� �������. ������� �� ����� ��� �������� �������, � ������� ������ ������� ������ ����������

public class Task06 {

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
			
			for(int j = 0; j < mas[i].length; j++) {

				if(j%2!=0) {
					
					if(mas[0][j]>mas[mas.length - 1][j]) {
							
				System.out.printf("mas[%d][%d] = %-6d",i,j,mas[i][j]);
					}
				}
				
			}
			
			System.out.println();
			
		}

	}

}
