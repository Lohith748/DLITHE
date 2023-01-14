
public class MyDate {


public int dd,mm,yy;
private boolean isLeapYear(int year) {
	return((year % 400 ==0) || (year %4 == 0  && year % 100 != 0));
		}
//check for valid date
private boolean isValid(int d, int m , int y) {
	if(d>31 || d<1 || m>12 || m < 1|| y<1)
		return false;
	else {
		switch(m) {
		case 4: case 6: case 9: case 11:
			if(d > 30)return false;
			break;
		case 2:
			if(isLeapYear(y)) {
				if(d>29) return false;
			}
			else if (d>28) return false;
		}
		return true;
	}
}
public void setDate(int day, int month, int year) {
	if(isValid(day,month,year)){
	dd= day;
	mm= month;
	yy= year;
}
	else
		throw new NullPointerException("Invalid Date");
}
public void printDate() {
	System.out.println(dd +"/"+ mm +"/"+ yy);
}
}
