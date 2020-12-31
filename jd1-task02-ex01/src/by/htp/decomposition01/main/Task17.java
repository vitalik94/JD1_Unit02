package by.htp.decomposition01.main;

/* 
 * Натуральное число, в записи которого n цифр, называется числом Армстронга, 
 * если сумма его цифр, возведенная в степень n, равна самому числу. 
 * Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию. 
 */

public class Task17 {

	public static void main(String[] args) {

		int n = 1;
		int a = 0;
		int b = 0;
		int sum = 0;
		int sumn = 0;
		int k = 0;

		numA(n, a, b, sum, sumn, k);

	}

	public static void numA(int n, int a, int b, int sum, int sumn, int k) {

		for (; n <= 100; n++) {

			a = n;

			while (a > 0) {

				b = a % 10;

				sum = sum + b;

				k++;

				a = a / 10;

			}

			sumn = (int) Math.pow(sum, k);

			if (sumn == n) {

				if (n > 9) {

					System.out.print(n + ", ");

				}

			}

			sum = 0;

			k = 0;

		}

	}

}
