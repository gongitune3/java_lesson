//関係演算子・等価演算子・論理演算子が生成する値を表示

import java.util.Scanner;

class BooleanPrint {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");	int a = stdIn.nextint();
		System.out.print("整数b：");	int b = stdIn.nextint();

		System.out.println("a < b = " + (a < b) );
		System.out.println("a <= b = " + (a <= b) );
		System.out.println("a > b = " + (a > b) );
		System.out.println("a >= b = " + (a >= b) );
		System.out.println("a == b = " + (a == b) );
		System.out.println("a < b = " + (a < b) );
		System.out.println("a < b = " + (a < b) );
		System.out.println("a < b = " + (a < b) );
	}
}