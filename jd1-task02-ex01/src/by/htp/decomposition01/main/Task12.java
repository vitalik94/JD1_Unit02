package by.htp.decomposition01.main;

/* 
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. 
 * Написать метод(методы) вычисления его площади, 
 * если угол между сторонами длиной X и Y — прямой. 
 */

public class Task12 {

	public static void main(String[] args) {

		double x = 1;

		double y = 2;

		double z = 3;

		double t = 4;

		double a = 90;

		double p = 0;

		double xy = 0;

		double b = 0;

		double s = 0;

		p = perimetr(x, y, z, t, p);
		xy = diagonal(x, y, xy);
		b = angle(z, t, xy, b);
		System.out.println("углы равняются:" + a + ", " + b);
		s = square(x, y, z, t, p, a, b, s);
		System.out.println("площадь четырехугольника равна:" + s);

	}

	public static double perimetr(double x, double y, double z, double t, double p) {

		p = (x + y + z + t) / 2;

		return p;

	}

	public static double diagonal(double x, double y, double xy) {

		xy = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

		return xy;

	}

	public static double angle(double z, double t, double xy, double b) {

		b = ((Math.pow(xy, 2) - Math.pow(z, 2) - Math.pow(t, 2)) / (-2 * z * t));

		b = Math.toDegrees(b);

		return b;

	}

	public static double square(double x, double y, double z, double t, double a, double p, double b, double s) {

		s = Math.sqrt((p - x) * (p - y) * (p - z) * (p - t) - x * y * z * t * Math.pow(Math.cos((a + b) / 2), 2));

		return s;

	}

}
