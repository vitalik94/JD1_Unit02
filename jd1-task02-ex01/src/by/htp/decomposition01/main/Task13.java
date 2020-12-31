package by.htp.decomposition01.main;

/* 
 * Дано натуральное число N. Написать метод(методы) для формирования массива, 
 * элементами которого являются цифры числа N. 
 */

public class Task13 {

	public static void main(String[] args) {

		int n = 1234;

		int a = 0;

		a = num(n, a);
		mas(n, a);

	}

	public static int num(int n, int a) {

		while (n > 0) {

			n = n / 10;

			a++;

		}

		return a;

	}

	public static void mas(int n, int a) {

		int[] mas = new int[a];

		int b = 0;

		int h = 0;

		for (int i = 0; i < mas.length; i++) {

			h = n / 10;

			b = n - h * 10;

			mas[i] = b;

			System.out.print(mas[i] + ", ");

			n = h;

		}

	}

}
