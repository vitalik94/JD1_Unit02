package by.htp.decomposition01.main;

/* 
 * Два простых числа называются «близнецами», 
 * если они отличаются друг от друга на 2 (например, 41 и 43). 
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], 
 * где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию. 
 */

public class Task16 {

	public static void main(String[] args) {

		int n = 10;

		num(n);

	}

	public static void num(int n) {

		int a = 0;
		
		int m = 2 * n;

		for (; n < m; n++) {

			for (int i = 1; i <= n; i++) {

				if (n % i == 0) {

					a++;

				}

			}

			if (a == 2) {

				System.out.print(n + ", ");

			}
			
			a = 0;

		}

	}

}
