import java.util.Scanner;

class Equal {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値a："); int a = stdIn.nextInt();
		System.out.print("整数値b："); int b = stdIn.nextInt();

		if (a == b)
			System.out.print("二つの値は等しいです。");
		else
			System.out.print("二つの値は等しくありません。");
	}
}