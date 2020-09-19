//改定＾＾＾＾

import java.util.Scanner;

class MaxMethod {
	static int max(int a, int b) {
		return (a > b) ? a : b;
	}


	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値a：");	int a = stdIn.nextInt();
		System.out.print("整数値b：");	int b = stdIn.nextInt();

		System.out.println("最大値は" + max(a,b) + "です。");
	}
}