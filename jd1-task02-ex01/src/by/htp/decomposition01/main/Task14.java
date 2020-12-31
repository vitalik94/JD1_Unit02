package by.htp.decomposition01.main;

// Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Task14 {

	public static void main(String[] args) {

		int n = 1542;

		int m = 24522;

		int a = 0;

		int b = 0;

		a = num1(n, a);
		b = num1(m, b);
		max(a, b, n, m);

	}

	public static int num1(int n, int a) {

		while (n > 0) {

			n = n / 10;

			a++;

		}

		return a;

	}

	public static int num2(int m, int b) {

		while (m > 0) {

			m = m / 10;

			b++;

		}

		return b;

	}

	public static void max(int a, int b, int n, int m) {

		if (a > b) {

			System.out.println("в числе n = " + n + " больше цифр, чем в m = " + m);

		} else if (b > a) {

			System.out.println("в числе m = " + m + " больше цифр, чем в n = " + n);

		} else {

			System.out.println("в числах n = " + n + " и m = " + m + " одинаковое количество цифр");

		}

	}

}
