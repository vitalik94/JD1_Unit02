package by.htp.decomposition01.main;

/* Ќаписать метод(методы) дл€ нахождени€ суммы большего и меньшего из трех чисел. 
 */

public class Task05 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		int x;
		int y;
		
		a = 1;
		b = 2;
		c = 3;
		
		System.out.println(a + "," + b + "," + c);
		x = min(a,b,c);
		System.out.println("min = " + x);
		y = max(a,b,c);
		System.out.println("max = " + y);
		sum(a,b,c);

	}
	
	public static int min(int a,int b,int c){
		
		int min;
		
         if(a < c & a < b) {
			min = a;
		}else if (b < c & b < a) {
			min = b;
		}else {	
			min = c;	
		}
		
		return min;
	
	}
	
	public static int max(int a,int b,int c){
		
		int max = 0;
		
		if(a > b & a > c) {
			max = a;
		}else if (b > a & b > c) {
			max = b;
		}else {	
			max = c;
		}
		
		return max;
	
	}
	
	public static void sum(int a, int b, int c){
		
		int sum;
		
		sum = min(a,b,c) + max(a,b,c);
		
		System.out.println("sum = " + sum);
		
    }

}
