//べき乗を求める
//list 7-6

import java.util.Scanner;

class Power1 {
	static double power(double x, int n) {
		double tmp = 1.0;

		while (n-- > 0)
			tmp *= x;	//tmpにxを掛ける
		// for (int i = 1; i <= n; i++)
		// 	tmp *= x;
		// ↑でも可能
		return tmp;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("aのb乗を求めます。");
		System.out.print("実数a：");	double a = stdIn.nextDouble();
		System.out.print("整数b：");	int b = stdIn.nextInt();

		System.out.println(a + "の" + b + "乗は" + power(a, b) + "です。" );


	}
}