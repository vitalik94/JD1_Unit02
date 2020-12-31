package by.htp.arrays03.main;

/*
 * Получить квадратную матрицу порядка n: 
 * 
 *      1          2   ...   n-1   n
 *     n+1        n+2  ...  2n-1  2n
 *    2n+1       2n+2  ...  3n-1  3n
 * (n-1)(n+2) (n-1)n+2 ... n^2+1  n^2
 */

public class Task25 {
	
	public static void main(String[] args) {
		
		int n = 5;
		
		int[][] mas = new int[n][n];
		
		mas(mas, n);
		print(mas);
		
	}
	
	public static void mas(int[][] mas, int n) {
		
		int a = 1;
		
		for(int i = 0; i < mas.length; i++) {
			
			for(int j = 0; j < mas[i].length; j++) {
				
				mas[i][j] = a;
				
				a++;
				
			}
			
		}
		
	}
	
	public static void print(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				System.out.printf("mas[%d][%d] = %-6d", i, j, mas[i][j]);

			}

			System.out.println();

		}

		System.out.println();

	}

}
