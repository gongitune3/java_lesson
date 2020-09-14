//float型とdouble型の変数を読み込んで表示

import java.util.Scanner;

class FloatDouble2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("変数xはfloat型で、変数yはdouble型です。");
		System.out.print("x:");	float x = stdIn.nextFloat();
		System.out.print("y:");	double y = stdIn.nextDouble();

		System.out.print("x = " + x);
		System.out.print("y = " + y);
	}
}