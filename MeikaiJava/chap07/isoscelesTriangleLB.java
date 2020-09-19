//左下が直角二等辺三角形を表示
//list 7-7

import java.util.Scanner;

class isoscelesTriangleLB {
	static void putStars(int n) {
		while (n-- > 0)
			System.out.print('*');
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("左下直角二等辺三角形");
		System.out.print("段数は：");
		int n = stdIn.nextInt();

		for (int i = 1; i <= n; i++) {
			putStars(i);
			System.out.println();
		}
	}
}

//値を返却しないメソッドの返却型は、voidと宣言する