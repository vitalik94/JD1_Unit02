package by.htp.decomposition01.main;

// Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task10 {

	public static void main(String[] args) {
		
		int m;
		m = 9;
		
		factorial(m);

	}
	
	public static int factorial(int m) {
		
		int n = 1;
		int sum = 0;
		
		for(int i = 1 ; i <= m ; i = i + 2) {
			
			System.out.println(i);
			
			n = n * i;
			sum = sum + n;
		}
		
		System.out.println(sum);
		
		return sum; 

	}

}
