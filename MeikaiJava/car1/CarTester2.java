//自動車クラス[第1版]の利用例(その2)
//list 8-6

import java.util.Scanner;

class CarTester2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("車のデータを入力してクレオパトラ");
		System.out.print("名前：");			String name = stdIn.next();
		System.out.print("車幅：");			int width = stdIn.nextInt();
		System.out.print("高さ：");			int height = stdIn.nextInt();
		System.out.print("長さ：");			int length = stdIn.nextInt();
		System.out.print("ガソリン量は：");	Double fuel = stdIn.nextDouble();

		Car myCar = new Car(name, width, height, length, fuel);

		while (true) {
			System.out.println("現在地(" + myCar.getX() + "," + myCar.getY() + ")・残り燃料" + myCar.getFuel());

			System.out.print("移動しますか[0…No / 1…Yes]：");
			if (stdIn.nextInt() == 0) break;

			System.out.print("x方向の移動距離：");
			double dx = stdIn.nextDouble();
			System.out.print("y方向の移動距離：");
			double dy = stdIn.nextDouble();

			if (!myCar.move(dx, dy))
				System.out.println("燃料が足りへんぞ");
		}
	}
}