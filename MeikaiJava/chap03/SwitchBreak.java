import java.util.Scanner;

class SwitchBreak {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数：");
		int n = stdIn.nextInt();

		switch (n) {
			case 0 : System.out.print("A");
					 System.out.print("B");
					 break;
			case 2 : System.out.print("C");
			case 5 : System.out.print("D");
					 break;
			// case 6 : 
			// case 7 : System.out.print("F");
			case 6,7 : System.out.print("F");
					 break;
			default: System.out.print("G");
					 break;
		}
		System.out.println(); //←これがいる理由
	}
}