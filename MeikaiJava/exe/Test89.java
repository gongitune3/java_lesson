//テスト

import java.util.Scanner;

class Test89 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {6,5,4,3,2,1,0};

		System.out.println("a = " + Arrays.toString(a));
		System.out.println("b = " + Arrays.toString(b));

		if (a.length != b.length)				//要素の数を揃えている
			b = new int[a.length];

		for (int i = 0; i < a.length; i++)		//配列aの全要素を配列bにコピー
			b[i] = a[i];

		System.out.println("a = " + Arrays.toString(a));
		System.out.println("b = " + Arrays.toString(b));
	}
}