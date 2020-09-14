import java.util.Scanner;

class Abc {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int x;
		do {
			System.out.print("正の整数値");
			x = stdIn.nextInt();
		} while (x <= 0);

		int y = x;
		int z = x;
		while (y >= 0)
			System.out.printf("%5d%5d\n", y--, ++z);

		System.out.printf("縦横が整数で面積%dの" + 
						 "長方形の辺の長さ：\n", x);

		for (int i = 1; i < x; i++) {
			if (i * i > x)	break;
			if (x % i  != 0  ) continue;
			System.out.printf("%d x %d\n", i, x / i);
		}
		for (int i = 1; i <= 5; i++)
			for (int j = 1; j <= 5; j++)
				System.out.print("");
			System.out.println();
	}
}