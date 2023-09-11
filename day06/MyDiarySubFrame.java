package day06;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.io.*;

public class MyDiarySubFrame {
	private JTextField tfDate;
	private JTextField tfTitle;
	private JTextArea taContent;
	
	JFrame f=new JFrame();
	
	public void readFile() {
		try {
		//[1] javax.swing.JFileChooser 띄우기=> 열기 모드로 띄우기
		//int	showOpenDialog(Component parent)
		JFileChooser jfc=new JFileChooser("D:/multicampus");	
		int n=jfc.showOpenDialog(taContent);
		f.setTitle("n: "+n);
		if(n==1) return;//취소시
			
		//[2] JFileChooser로 부터 파일명의 절대경로 얻어오기
		//File	getSelectedFile()
		File file=jfc.getSelectedFile();
		String path=file.getAbsolutePath();
		f.setTitle(path);
		//[3] FileReader 객체 생성
		FileReader fr=new FileReader(path);
		char[] data=new char[1000];
		int n2=0;
		//[4] 반복문 이용해서 읽어와서 문자열 변수에 누적지키기
		String str="";
		while((n2=fr.read(data))!=-1) {
			String content=new String(data,0,n2);
			str+=content;
		}		
		//[5] taContent에 읽어온 파일 내용 출력하기
		taContent.setText(str);
		
		//[6] FileReader close()하기
		fr.close();
		
		}catch(IOException ex) {
			f.setTitle("파일 읽기 에러: "+ex);
		}
	}//---------------------------
	
	
	public void writeFile() {
		//f.setTitle("파일 저장 예정");
		try {
		//날짜값 가져오기 ===>파일명으로 활용 "20230908.txt'
		String date=tfDate.getText();
		//제목 가져오기
		String title=tfTitle.getText();			
		//일기 내용 가져오기
		String content=taContent.getText();
		
		if(date==null||date.equals("")) {
			JOptionPane.showMessageDialog(f, "날짜를 입력해야 해요(yyyymmdd)");
			tfDate.requestFocus();
			return;
		}
		String fileName="D:/multicampus/"+date+".txt";
		
		
		//FileWriter객체 생성하기
		FileWriter fw=new FileWriter(fileName);
		//파일에 제목과 일기내용 저장하기 ==> write()사용
		fw.write("작성일: "+date+"\n");
		fw.write("제 목 : "+title+"\n");
		fw.write("\n");
		fw.write(content+"\n");
		fw.flush();
		
		//FileWriter close()호출하기
		fw.close();
		f.setTitle(fileName+"저장 완료!!");
		
		}catch(IOException ex) {
			f.setTitle("파일 입출력 에러 발생: "+ex);
		}
		
	}//------------------------------
	
	
	public void createSubGui() {
		
		f.setSize(800,800);
		f.setLocation(400,200);//x,y
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		f.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		tfDate = new JTextField();
		tfDate.setFont(new Font("굴림", Font.BOLD, 24));
		tfDate.setBounds(37, 39, 699, 78);
		panel.add(tfDate);
		tfDate.setColumns(10);
		
		tfTitle = new JTextField();
		tfTitle.setFont(new Font("굴림", Font.BOLD, 24));
		tfTitle.setColumns(10);
		tfTitle.setBounds(37, 153, 699, 78);
		panel.add(tfTitle);
		
		taContent = new JTextArea();
		taContent.setBounds(37, 268, 699, 374);
		panel.add(taContent);
		taContent.setFont(new Font("굴림", Font.BOLD,24));
		
		JButton btSave = new JButton("파일에 저장");
		btSave.setBackground(new Color(255, 160, 122));
		btSave.setFont(new Font("굴림", Font.BOLD, 20));
		btSave.setBounds(37, 675, 335, 78);
		panel.add(btSave);
		
		JButton btRead = new JButton("일기 가져오기");
		btRead.setFont(new Font("굴림", Font.BOLD, 20));
		btRead.setBackground(new Color(255, 160, 122));
		btRead.setBounds(401, 675, 335, 78);
		panel.add(btRead);
		
		tfDate.setBorder(new TitledBorder("오늘 날짜"));
		tfTitle.setBorder(new TitledBorder("제   목"));
		taContent.setBorder(new TitledBorder("일기 내용"));
		
		
		btSave.addActionListener( e->{
			writeFile();
		});
		
		
		btRead.addActionListener(e ->{
			readFile();
		});
		
		f.setVisible(true);
	}
	/*
	public static void main(String[] args) {
		MyDiarySubFrame sub=new MyDiarySubFrame();
		sub.createSubGui();
	}
	*/
}

