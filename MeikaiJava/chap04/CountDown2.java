import java.util.Scanner;

class CountDown2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("カウントダウン開始");
		int x;
		do {
			System.out.println("正の整数値");
			x = stdIn.nextInt();
		} while (x <= 0);

		while (x >= 0)
			System.out.println(x--);
	}
}