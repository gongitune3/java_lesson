//点数を読み込んで最高点を表示
//list 6-8

import java.util.Scanner;

class HighScore {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		fainal int NUMBER = 5;
		int[] tensu = new int[NUMBER];

		System.out.println(NUMBER + "人の点数を入力せよ。");
		for (int i = 0; i < NUMBER; i++)
			System.out.print((i + 1) + "番の点数：");
			tensu[i] = stdIn.nextInt();
			
	}
}