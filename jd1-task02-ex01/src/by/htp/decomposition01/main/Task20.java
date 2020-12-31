package by.htp.decomposition01.main;

/* 
 * Из заданного числа вычли сумму его цифр. 
 * Из результата вновь вычли сумму его цифр и т.д. 
 * Сколько таких действий надо произвести, чтобы получился нуль? 
 * Для решения задачи использовать декомпозицию. 
 */

public class Task20 {

	public static void main(String[] args) {

		int n = 100;
		int sum = 0;
		int a = 0;
		int b = 0;
		int i = 0;

		i = sum(n, sum, a, b, i);
		printSum(i);

	}

	public static int sum(int n, int sum, int a, int b, int i) {

		while (n > 0) {

			a = n;

			while (a > 0) {

				b = a % 10;

				sum = sum + b;

				a = (a - b) / 10;

			}

			n = n - sum;

			i++;

			sum = 0;

		}

		return (i);

	}

	public static void printSum(int i) {

		System.out.println(i);

	}

}
