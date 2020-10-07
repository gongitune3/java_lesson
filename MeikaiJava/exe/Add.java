//テスト、なぜ動かないのか・・・


public class Add {
	public static void main(String[] args) {
		String adachiAccountName 	= "足立晃一";
		String adachiAccountNo 		= "123456";
		long adachiAccountBlance	= 530000000;

		String nakataAccountName 	= "仲田真司";
		String nakataAccountNo 	= "654321";
		long nakataAccountBlance 	= 53000000;

		adachiAccountBlance -= 200;
		nakataAccountBlance += 100;
		
		System.out.println("■足立氏の口座");
		System.out.println("	口座名義：" + adachiAccountName);
		System.out.println("	口座番号：" + adachiAccountNo);
		System.out.println("	預金残高：" + adachiAccountBlance);

		System.out.println("■仲田氏の口座");
		System.out.println("	口座名義：" + nakataAccountName);
		System.out.println("	口座番号：" + nakataAccountNo);
		System.out.println("	預金残高：" + nakataAccountBlance);
	
	}
}