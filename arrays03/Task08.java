package by.htp.arrays03.main;

import java.util.Random;

/* ���  ���������� ������  nxm  ���������. ����������, 
 * �������  ���  �����������  �����  7  ����� ��������� �������
 */

public class Task08 {

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
		
		int n = 0;

		for(int i = 0; i < mas.length; i++) {
			
			for(int j = 0; j < mas[i].length; j++) {
				
				if(mas[i][j]==7) {
					
					n = n + 1;

				}
				
			}
			
		}
		
		System.out.println("����� 7 ����������� " + n + " ���(�)");

	}

}
