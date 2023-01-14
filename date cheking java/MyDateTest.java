public class MyDateTest {
public static void main(String [] args) {
	int a=420;
	MyDate d1 = new MyDate();
	int day = 15, month=12, year =2018;
	d1.setDate(day, month, year);
	d1.printDate();
	d1.dd=100;
	d1.mm=200;
	d1.yy=2023;
}
}
