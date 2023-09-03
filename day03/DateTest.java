package day03;
import java.util.*;
public class DateTest {
	public static void main(String[] args) {
	Date date = new Date();
	int hh = date.getHours();
	int mm = date.getMinutes();
	int ss= date.getSeconds();
	
	System.out.printf("현재 시간은 %d:%d:%d%n", hh, mm, ss);
	
	int yy=date.getYear()+1900;
	int month=date.getMonth()+1;
	int dd=date.getDate();
	int dy=date.getDay();
	System.out.printf("오늘 날짜는 %d년 %d월 %d일 %d요일 입니다\n", yy, month, dd, dy);
	
	//[1] month
	//28 : 2월
	//31 : 1, 3, 5, 7, 8, 10, 12
	//30 : 4, 5, 9, 11
	//switch ~ case문 이용해서 "9월은 30일 까지 있습니다."
	
	switch(month){
//		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//			System.out.printf("%d월은 31일까지 있습니다\n", month);
//		break;
		case 4: case 6: case 9: case 11:
			System.out.printf("%d월은 30일까지 있습니다\n", month);
		break;
		
		case 2:
			System.out.printf("%d월은 28일까지 있습니다\n", month);
		break;
		
		default:
			System.out.printf("%d월은 31일까지 있습니다\n", month);
		
		}
	}
}