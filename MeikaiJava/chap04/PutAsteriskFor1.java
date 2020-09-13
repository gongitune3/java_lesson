import java.util.Scanner;

class PutAsteriskFor1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("何個*を表示させますか：");
			int n = stdIn.nextInt();

		for (int i = 0; i < n; i++)
			System.out.print('*');
		System.out.println();
	}
}