import java.util.Scanner;

class PutAsterisk {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("何個*を表示しますか？:");
		int n = stdIn.nextInt();
		int i = 0;
		while (i < n) {
			System.out.print("*");
			i++;
		}
		System.out.println();
	}
}