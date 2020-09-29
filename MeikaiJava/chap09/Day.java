//日付クラス第１版
//list 9-1

class Day {
	private int year;
	private int month;
	private int date;
}

Day(int year, int month, int date) {
	this.year 	= year;
	this.month 	= month;
	this.date 	= date;
}

//--年・月・日を取得
int getYear(int year) {this.year = year;}
int getMonth(int month) {this.month = month;}
int getDate(int date) {this.date = date;}

//--年・月・日を設定
