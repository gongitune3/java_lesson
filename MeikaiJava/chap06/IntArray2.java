//配列の各要素に1,2,3,4,5を代入して表示

class IntArray2 {
	public static void main(String[] args) {
		int[] a = new int [5];	//配列の宣言

		for (int i = 0; i < a.length; i++) 
		a[i] = i + 1;
		
		for (int i = 0; i < a.length; i++)
		System.out.println("a["+ i +"] = " + a[i] );
	}
}

//配列変数名.lengthで要素数＝長さを取得できる
//ここでは５が取れる
//lengthはint型でなく、fainal　intでございます。その為、tame,lengthに値を導入することはできません。