//System.out.printfのテスト

class PrintfTester {
	public static void main(String[] args) {
		System.out.printf("%d\n", 12345);	//10進数
		System.out.printf("%3d\n", 12345);	//少なくとも3桁
		System.out.printf("7%d\n", 12345);	//少なくとも7桁
		System.out.println();
		
		System.out.printf("%5d\n", 123);		//少なくとも5桁
		System.out.printf("%05d\n", 123);		//少なくとも5桁
		System.out.println();
		
		System.out.printf("%d\n", 13579);		//10進数
		System.out.printf("%o\n", 13579);		//8進数
		System.out.printf("%x\n", 13579);		//16進数
		System.out.printf("%X\n", 13579); 		//16進数（大文字）
		System.out.println();
		
		System.out.printf("%f\n", 123.45);		//浮動小数点
		System.out.printf("%15f\n", 123.45);	//全体を15桁で表示
		System.out.printf("%9.2f\n", 123.45);	//全体を9桁で表示
		System.out.println();
		
		System.out.printf("XYZ\n");				//文字列(置換なし)
		System.out.printf("%s\n", "ABCDE");		//文字列
		System.out.printf("%3s\n", "ABCDE");	//少なくとも3桁
		System.out.printf("%10s\n", "ABCDE");	//少なくとも10桁
		System.out.println();
	}
}