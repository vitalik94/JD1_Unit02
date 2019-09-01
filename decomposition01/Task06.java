package by.htp.decomposition01.main;

/* Вычислить площадь правильного шестиугольника со стороной а, 
 * используя метод вычисления площади треугольника.
 */

public class Task06 {

	public static void main(String[] args) {
		
		int a;
		double x;
		
		a = 1;
		
		System.out.println("a = " + a);
		x = square1(a);
		System.out.println("s = " + x);
		square(a);
		
	}
	
	public static double square1(int a){
		
		double s;
		
		s = (Math.pow(a, 2) * Math.sqrt(3)) / 4;
		
		return s;
	
	}
	public static void square(int a){
		
		double S;
		
         S = 6 * square1(a);
		
		System.out.println("S = " + S);
	
	}

}
