import java.util.Scanner;

class Test123 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("テストを始めます");
		System.out.println("YES…1/NO…0");

		int x = stdIn.nextInt();

		if (x == 1)
			System.out.println("テストを開始します。")
		else
			System.out.println("………中止します。")
	}
}