//整数リテラル（10進数/8進数/16進数）

class DecOctHexLiteral {
	public static void main(String[] args) {
		int a = 13;		//10進数
		int b = 013;	//8進数
		int c = 0x13;	//16進数

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}