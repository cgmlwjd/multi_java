package day03;
import javax.swing.*;
public class SwitchTest {
	public static void main(String[] args) {
		int avg = Integer.parseInt(JOptionPane.showInputDialog("평균 점수 입력: "));
		char grade = ' ';
		switch(avg/10) {
		case 10:
			grade = 'A'; break;
		case 9:
			grade ='A'; break;
		case 8:
			grade = 'B'; break;
		case 7:
			grade = 'C'; break;
		case 6:
			grade = 'D'; break;
		default:
			grade = 'F';
		}
		System.out.println("학점: " + grade);
	}

}
