//べき乗を求める
//list 7-6

class Power1 {
	static double power(double x, int n) {
		double tmp = 1.0;

		while (n-- > 0)
			tmp *= x;	//tmpにxを掛ける
		// for (int i = 1; i <= n; i++)
		// 	tmp *= x;
		// ↑でも可能
		return tmp;
	}
	
	
	public static void main(String[] args) {
		
	}
}