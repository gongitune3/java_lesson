//暗算トレーニング
//list 7-10

import java.util.Random;
import java.util.Scanner;


class MentalArithmetic {
	static Scanner stdIn = new Scanner(System.in);

	//--続行の確認--//
	static boolean confirmRetry {
		int count;
		do {
			System.out.print("もう一度?<Yes…1/No…0>：");
			count = stdIn.nextInt();
		}	while (count != 0 && count != 1);
		return count == 1;		//countが1であればtrun、そうでなければfalseを返す。
	}

}