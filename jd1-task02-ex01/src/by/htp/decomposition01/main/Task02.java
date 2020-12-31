package by.htp.decomposition01.main;

/* 
 *  Написать метод(методы) для нахождения наибольшего общего делителя и
 *  наименьшего общего кратного двух натуральных чисел: 
 * 
 *  НОК(A,B) = (A*B / НОД(A,B))
 */

public class Task02 {
	
	public static void main(String[] args) {
		
		int A;
		int B;
		
		
		
		A = 4;
		B = 2;
		
		NOD(A,B);
		System.out.println("NOD(A,B) = " + NOD(A,B));
		NOK(A,B);
		
		
		
	}
	
	public static int NOD(int A,int B){
		
		int k;
		int m;
		
		if(A>B) {
			m = B;
		}else {
			m = A;
		}
		for(k = m ; k >= 1 ;k--){
			
			if(A % k == 0 & B % k == 0){
				
				break;
				
			}	
		}
		return k;	
    }
	
	public static void NOK(int A, int B){
		
		int NOK;
		
		NOK = (A * B)/NOD(A,B);
		System.out.println("NOK(A,B) = " + NOK);
		

    }
	
}