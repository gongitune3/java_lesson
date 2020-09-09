import java.util.Scanner;
	class ArithInt {
		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);

			System.out.println("xとyを加減剰余します");
			
			System.out.print("xの値"); //xの値の入力を促す。
			int x = stdIn.nextInt();  //xに整数値を読み込む。

			System.out.print("yの値"); //yの値の入力を促す。
			int y = stdIn.nextInt();  //yに整数値を読み込む。

			System.out.println(" x + y = " + (x + y));
			System.out.println(" x - y = " + (x - y));
			System.out.println(" x * y = " + (x * y));
			System.out.println(" x / y = " + (x / y));
			System.out.println(" x % y = " + (x % y));

		}
}