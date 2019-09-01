package by.htp.arrays03.main;

import java.util.Random;

/* C������ ������� 3 x 4, ��������� �� ������� 0 � 1 ���, ����� � ����� ������ 
 * ���� ����� ���� �������, � ������� �� �����.
 */

public class Task01 {

	public static void main(String[] args) {
		
		int [][] mas = new int [3][4];
		
		Random rand = new Random();
		
		for(int i = 0; i < mas.length; i++) {
			
			for(int j = 0; j < mas[i].length; j++) {
				
				mas[i][j] = rand.nextInt(2);
				
			}
			
		}
		
		for(int i = 0; i < mas.length; i++) {
			
			for(int j = 0; j < mas[i].length; j++) {
				
				mas[i][j]=(i==j)?1:0;
				
				System.out.printf("mas[%d][%d] = %-6d",i,j,mas[i][j]);
				
			}
			
			System.out.println();
			
		}

	}

}
