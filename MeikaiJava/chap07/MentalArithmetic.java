//暗算トレーニング
//list 7-10

import java.util.Random;
import java.util.Scanner;


class MentalArithmetic {
	static Scanner stdIn = new Scanner(System.in);

	//--続行の確認--//
	static boolean confirmRetry() {
		int cont;
		do {
			System.out.print("もう一度?<Yes…1/No…0>：");
			cont = stdIn.nextInt();
		} while  (cont != 0 && cont != 1);
		return cont == 1;		// contが1であればtrue、そうでなければfalseを返す。
	}

	public static void main(String[] args) {
		Random rand = new Random();

		System.out.println("暗算トレーニング");
		do {
			int x = rand.nextInt(900) + 100;
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;

			while (true) {
				System.out.print(x + " + "  + y + " + " + z + " =");
				int k = stdIn.nextInt();
				if (k == x + y + z)
					break;
				System.out.println("マチガイデゴザイマス");
			}
		} while (confirmRetry());
	}
}