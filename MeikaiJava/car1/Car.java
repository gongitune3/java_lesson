//自動車クラス[第1版]
//list 8-4

class Car {
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;

	//--コンストラクタ--//
	Car(String name, int width, int height, int length, double fuel) {
		this.name = name;		this.width = width;		this.height = height;
		this.length = length;	this.fuel = fuel;
		x = y = 0.0;
	}

	double getX() {return x;}			//現在位置Yを取得
	double getY() {return y;}			//現在位置Yを取得
	double getFuel() {return fuel;}		//残り燃料を取得

	//--スペック表示--//
	void putSpec() {
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width  + "mm" );
		System.out.println("車高：" + height + "mm" );
		System.out.println("車長：" + length + "mm" );
	}

	boolean move (double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);		//移動距離
		if (dist > fuel)
			return false;	//移動できない、燃料不足
		else {
			fuel -= dist;	//移動距離分の燃料がへる
			x += dx;
			y += dy;
			return true;	//移動完了
		}
	}
}