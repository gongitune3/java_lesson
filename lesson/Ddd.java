//10/1→github分
import java.util.Scanner;

class Ddd {
	//--配列aの複製を作成して返却--//
	static int[] cloneOf(int[] a) {
		int[] c = new int[a.length];
		for (int i = 0; i < a.length; i++)
			c[i] = a[i];
		return c;
	}
}




class ArrayClone {
	//--配列aの複製を作成して返却--//
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int num = stdIn.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		int[] y = cloneOf(x);

		System.out.println("配列xの複製yを作成しました。");
		for (int i = 0; i < num; i++)
			System.out.println("y[" + i + "] = " + y[i]);
	}
}