package day11;
import java.awt.event.*;
import java.awt.*;
//이벤트 핸들러: 외부 클래스로 별도로 만들어보자
public class MyHandler implements ItemListener{
	MyGui2 main;
	public MyHandler(MyGui2 main) {
		this.main =main;
	}
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		//System.out.println("%%%%");
		//ch에서 선택한 문자열 알아내기
		Color cr=Color.gray;
		String item=main.ch.getSelectedItem();
		main.setTitle(item+"을 선택했군요");
		switch(item) {
			case "Red": cr=Color.red; break;
			case "Green": cr=Color.green;break;
			case "Blue": cr=Color.blue;break;
			case "Magenta": cr=Color.magenta;break;
			case "Yellow": cr=Color.yellow;break;
			default: cr=Color.cyan;		
		}//switch
		
		//can색상에 적용하기
		main.can.setBackground(cr);
		
	}


}