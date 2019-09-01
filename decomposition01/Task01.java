package by.htp.decomposition01.main;

// Треугольник задан координатами своих вершин. Написать метод для вычисления его площади

public class Task01 {
	
	public static void main(String[] args) {
		
		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;
		
		double AB;
		double BC;
		double CA;
		double p;
		
		
		x1 = 1;
		y1 = 2;
		x2 = 15;
		y2 = 20;
		x3 = 35;
		y3 = 45;
		
		AB = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		BC = Math.sqrt(Math.pow((x3-x2), 2) + Math.pow((y2-y3), 2));
		CA = Math.sqrt(Math.pow((x3-x1), 2) + Math.pow((y3-y1), 2));
		
		
		
		p = (AB + BC + CA)/2;
		
		System.out.println("p = " + p);
		
		area(p,AB,BC,CA);

			
	}
	
	public static void area(double AB,double BC,double CA,double p){
		
		double area;
		
		area = Math.sqrt(p * (p - AB) * (p - BC) * (p - CA));
		
		System.out.println("area = " + area);
		
	}


}
