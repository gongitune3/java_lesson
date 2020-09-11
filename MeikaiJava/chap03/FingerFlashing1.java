import java.util.Scanner;

class FingerFlashing1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("手を選んでください。0・・・グー/１・・・チョキ/２・・・パー");
		int hand = stdIn.nextInt();

		if (hand == 0)
			System.out.println("グー");
		else if (hand == 1)
			System.out.println("チョキ");
		else if (hand == 2)
			System.out.println("パー");


	}
}