package by.htp.decomposition01.main;

// �������� �����(������), �����������, �������� �� ������ ��� ����� ������� ��������. 

public class Task09 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		a = 1;
		b = 2;
		c = 3;
		
		NOD(a,b,c);
		relativelyprime(a,b,c);


	}
	
	public static int NOD(int a,int b,int c){
		
		int m;
		
		if(a < b & a < c ) {
			
			m = a;
			
		}else if (b < a & b < c ) {
			
			m = b;
		}else {	
			
			m = c;
		}
		
		int k;
		
		for ( k = m ; k > 0 ;k-- ) {
			
			if(a % k == 0 & b % k == 0 & c % k == 0) {
				
				break;
				
			}
			
		}
		return k;
	}
	
	public static void relativelyprime(int a,int b,int c){
		
		if(NOD(a,b,c)==1) {
			
			System.out.println(a + "," + b + "," + c);
			System.out.println("������� ������� �����");
			
		}else {
			
			System.out.println(a + "," + b + "," + c);
			System.out.println("�� ������� ������� �����");
			
		}
	
	}
	
	
	

}
