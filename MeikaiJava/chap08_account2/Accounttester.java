//銀行口座クラス[第２版]とテスト用クラス
//list 8-3
class Account2 {
	private String name;	//口座名義
	private String no;		//口座番号
	private long balance;	//預金残高

	//--コンストラクタ--//
	Account2(String n, String num, long z) {
		name = n;		//口座名義
		no = num;		//口座番号
		balance = z;	//預金残高
	}

	//--口座名義を調べる--//
	String getName() {
		return name;
	}

	//--口座番号を調べる--//
	String getNo() {
		return no;
	}

	//--預金残高を調べる--//
	long getBalance() {
		return balance;
	}

	//--k円預ける--//
	void desposit(long k) {
		balance += k;
	}

	//--k円おろす--//
	void withdraw(long k) {
		balance -= k;
	}
}

//銀行口座クラス[第２版]
class Accounttester {
	public static void main(String[] args) {
		Account2 adachi = new Account2("足立晃一", "123456", 1000);
		Account2 nakata = new Account2("仲田真司", "654321", 4000);

		adachi.withdraw(200);
		nakata.desposit(100);

		System.out.println("■足立氏の口座");
		System.out.println("	口座名義：" + adachi.getName());
		System.out.println("	口座番号：" + adachi.getNo());
		System.out.println("	預金残高：" + adachi.getBalance());

		System.out.println("■仲田氏の口座");
		System.out.println("	口座名義：" + nakata.getName());
		System.out.println("	口座番号：" + nakata.getNo());
		System.out.println("	預金残高：" + nakata.getBalance());
	}
}