import  java.util.Scanner;

class Season {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("季節を求めます。\n何月ですか：");
		int month = stdIn.nextInt();

		if (month >= 3 && month <= 5)
			System.out.println("春です。");
		else if (month >= 6 && month <= 8)
			System.out.println("夏です。");
		else if (month >= 9 && month <= 11)
			System.out.println("秋です。");
		else if (month >= 12 && month <= 2)
			System.out.println("冬です。");


	}
}