package day11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//XXXListener
/*
 * 이벤트 소스: JButton, JTextField, JTextArea, JRadioButton, JCheckbox, Choice
	이벤트: ActionEvent, KeyEvent, ItemEvent
	이벤트 핸들러:
	ActionListener
	KeyListener
	ItemListener 
	=> XXXListener인터페이스를 상속받아야 함
 * 
 * *************************************
 * 이벤트 처리 절차
 * [1] import java.awt.event.*;
 * [2] XXXListener 인터페이스를 상속받는다 (ActionListener)
 * [3] 추상메서드를 오버라이딩한다. (빈블럭으로) => 이벤트 처리 메서드
 * [4] 이벤트소스에 리스너를 붙인다. addXXXListener()메서드 이용
 * 		=> b1.addActionListener(핸들러객체)
 * [5] 오버라이딩한 메서드에 이벤트 처리코드를 구현
 * **************************************
 * */
public class MyGui extends JFrame implements ActionListener  {
	//MyGui ==> 이벤트 핸들러로 만들어보자
	
	Container cp;

	JPanel p1, p2;
	JButton b1,b2,b3;
	
	Canvas can;//도화지 클래스
	
	public MyGui() {
		//super("::MyGui::");
		this.setTitle("::MyGui::");
		
		cp=this.getContentPane();
		
		p1=new JPanel();
		p2=new JPanel();
		
		cp.add(p1,"Center");
		cp.add(p2,"North");
		p2.setBackground(Color.cyan);
		p1.setBackground(Color.white);
		
		p2.add(b1=new JButton("Red"));
		p2.add(b2=new JButton("Green"));
		p2.add(b3=new JButton("Blue"));
		
		p1.setLayout(null);//레이아웃 해제
		
		can=new Canvas();//캔버스는 사이즈와 배경색을 줘야 함
		can.setSize(200,200);
		can.setLocation(150,90);
		can.setBackground(new Color(120,80,200));
		p1.add(can);
		
		/*b1.addActionListener(e->{
			can.setBackground(Color.red);
		});*/
		//리스너 부착 <=생성자 안에서
		b1.addActionListener(this);//this=>ActionListener를 구현한 객체(이벤트 핸들러)
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		//창닫기 처리 메서드
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프로세스 종료
		
		this.setSize(500,500);
		this.setVisible(true);
	}//생성자-----------------------
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//이벤트 처리 코드 작성
		Object obj=e.getSource();//이벤트소스의 주소값을 반환하는 메서드
		if(obj==b1) {
			can.setBackground(Color.red);
		}else if(obj==b2) {
			can.setBackground(Color.green);
		}else if(obj==b3) {
			can.setBackground(Color.blue);
		}
	}//-------------------------

	public static void main(String[] args) {
		
		new MyGui();
	}

}
