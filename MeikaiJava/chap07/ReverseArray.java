//配列の要素に値を読み込んで並びを反転する
//list 7-16

import java.util.Scanner;

class  ReverseArray {
	//--配列の要素a[indx1]とa[idx2]を交換--//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	
	
	
	static void revese(int[] a) {
		for (int i = 0; i < a.length / 2; i++)
			swap(a, i, a.length -i -1);;
	}
}