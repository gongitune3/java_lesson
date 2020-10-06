//上の階層でjava拡張子が動かないので、、、

import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("テスト");
		System.out.print("数値の入力："); int n = stdIn.nextInt();
		int y = n * 2;

		System.out.println("入力した数値を２倍すると…" + y );
	}
}