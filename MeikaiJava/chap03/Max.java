import java.util.Scanner;

class Max {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");	int a = stdIn.nextInt();
		System.out.print("整数b：");	int b = stdIn.nextInt();
		System.out.print("整数c：");	int c = stdIn.nextInt();

		int max = a;
		if (max < b) max = b;
		if (max < c) max = c;

		System.out.println("最大値は" + max + "です。");
	}
}