package by.htp.arrays01.main;



/* Даны действительные числа а1 ,а2 ,..., аn . 
 * Поменять местами наибольший и наименьший элементы
 */

public class Task09 {

	public static void main(String[] args) {
		
		
		
		int[] mas = {1,2,3,4,5};
		
		Random1(mas);
		print(mas);
		maxmin(mas);
		print2(mas);

	}
	
	public static void Random1(int[] mas) {
		
		
		
		for (int i = 0 ; i < mas.length ; i++ ) {
			
			
		}
		
	}
	
	public static void print(int[] mas) {
		
		for (int i = 0 ; i < mas.length ; i++ ) {
			
			System.out.print(mas[i] + ", ");
		}
		System.out.println();
	}
	
	public static void maxmin(int[] mas) {
		
		int imax;
		imax = 1;
		int imin;
		imin = 1;
		int a;

		for (int i = 0 ; i < mas.length ; i++ ) {
			
			if (mas[i] > mas[imin]) {

				imin = i;
				
			}
			if (mas[i] < mas[imax]) {

				imax = i;

		    }
			
			a = mas[imin];
			mas[imin] = mas[imax];
			mas[imax] = a;

		}
		

		
	}
	
	public static void print2(int[] mas) {
		
		
		for (int i = 0 ; i < mas.length ; i++ ) {
			
			System.out.print(mas[i] + ", ");
		}

	}
	

}


