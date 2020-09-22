//銀行口座クラス「第１版」とそれをテストするクラス
//list 8-2


//銀行口座クラス「第１版」

class Account {
	String name;	//口座名義
	String no;		//口座番号
	long blance; 	//預金残高
}

class AccountTester {
	public static void main(String[] args) {
		Account adachi = new Account();		//足立くんの口座
		Account nakata = new Account();		//仲田くんの口座

		adachi.name   = "足立晃一";
		adachi.no 	  = "123456";
		adachi.blance = 1000;

		nakata.name   = "仲田真司";
		nakata.no 	  = "654321";
		nakata.blance = 3000;

		adachi.blance -= 200;
		nakata.blance += 200;

		System.out.println("■足立晃一");
		System.out.println("	口座名義：" + adachi.name);
		System.out.println("	口座番号：" + adachi.no);
		System.out.println("	暗唱番号：" + adachi.blance);

		System.out.println("■仲田真司");
		System.out.println("	口座名義：" + nakata.name);
		System.out.println("	口座番号：" + nakata.no);
		System.out.println("	暗唱番号：" + nakata.blance);
	}
}