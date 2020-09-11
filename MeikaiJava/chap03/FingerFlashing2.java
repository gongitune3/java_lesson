import java.util.Scanner;

public class FingerFlashing2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("手を選んでください。0・・・グー/１・・・チョキ/２・・・パー");
		int hand = stdIn.nextInt();

		switch(hand) {
			case 0 :System.out.println("グー"); break;
			case 1 :System.out.println("チョキ"); break;
			case 2 :System.out.println("パー"); break;
		}
	}
}