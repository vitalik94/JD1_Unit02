package by.htp.decomposition01.main;

// Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Task03 {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int d;
		int x;
		int y;
		int z;
		
		a = 4;
		b = 10;
		c = 26;
		d = 34;
		
		x = NOD1(a,b);
		
		System.out.println("NOD(a,b) = " + x);
		
		y = NOD2(c,d);
		
		System.out.println("NOD(c,d) = " + y);
		
		z = NOD3(x,y);
		
		System.out.println("NOD(x,y) = " + z);
		
	}
	
	public static int NOD1(int a,int b){
		
		int m;
		
		if(a < b) {
			m = a;
		}else {
			
			m = b;
			
		}
		
		int k;
		
		for ( k = m ; k > 0 ;k-- ) {
			
			if(a % k == 0 & b % k == 0) {
				
				break;
				
			}
			
		}
		return k;
	} 
		public static int NOD2(int c,int d){
			
			int m;
			
			if(c < d) {
				m = c;
			}else {
				
				m = d;
				
			}
			
			int k;
			
			for ( k = m ; k > 0 ;k--) {
				
				if(c % k == 0 & d % k == 0) {
					
					break;
					
				}
				
			}
			return k;
	}
	
		public static int NOD3(int x,int y){
			
			int m;
			
			if(x < y) {
				m = x;
			}else {
				
				m = y;
				
			}
			
			int k;
			
			for ( k = m ; k > 0 ;k--) {
				
				if(x % k == 0 & y % k == 0) {
					
					break;
					
				}
			
			}
			return k;
		} 
}
