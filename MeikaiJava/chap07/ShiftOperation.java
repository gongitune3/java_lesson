//int型の値を左右に動かした値を表示
//list 7-13

import java.util.Scanner;

class ShiftOperation {
	//--int型のビット構成を表示--//
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.out)
	}
}