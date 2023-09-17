package mychat;
import java.net.*;
import java.io.*;
import java.util.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;


public class MyChatting extends JFrame implements Runnable{
	
	private String host="localhost";
	private final int port=9999;
	private Socket sock;
	
	private BufferedReader in;
	private PrintWriter out;
	private boolean flag=false;
	
	private JTextField tfId;
	private JPasswordField tfPw;
	private JTextField tfInput;
			JTextArea taMsg;
	
	CardLayout card;
	JPanel panel = new JPanel();
	JPanel panel_1 = new JPanel();
	JPanel panel_2 = new JPanel();
	
	HashMap<String, String> userMap=new HashMap<>();
	
	String loginId;//로그인한 ID
	boolean isLogin=false;
	
	public MyChatting() {
		super("::MyChatting::");
		this.setSize(500,700);
		
		//임의의 회원정보 저장---------
		userMap.put("pong", "123");
		userMap.put("hong", "abc");
		userMap.put("admin", "tiger");
		
		panel.setBackground(SystemColor.inactiveCaption);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(card=new CardLayout(0, 0));
		
		
		panel_1.setBackground(Color.YELLOW);
		panel.add(panel_1, "loginP");
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MyTalk");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("휴먼아미체", Font.BOLD, 30));
		lblNewLabel.setBounds(106, 75, 219, 81);
		panel_1.add(lblNewLabel);
		
		tfId = new JTextField();
		tfId.setBounds(123, 192, 235, 70);
		panel_1.add(tfId);
		tfId.setColumns(10);
		
		tfPw = new JPasswordField();
		tfPw.setBounds(123, 299, 235, 70);
		panel_1.add(tfPw);
		
		JButton btLogin = new JButton("Login");
		btLogin.setForeground(Color.YELLOW);
		btLogin.setBackground(Color.DARK_GRAY);
		btLogin.setFont(new Font("Serif", Font.BOLD, 24));
		btLogin.setBounds(123, 403, 235, 61);
		panel_1.add(btLogin);
		
		
		
		
		panel_2.setBackground(SystemColor.textHighlightText);
		panel.add(panel_2, "chatP");
		panel_2.setLayout(null);
		
		taMsg = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(taMsg);
		scrollPane.setBounds(30, 30, 414, 470);
		
		panel_2.add(scrollPane);
		
		tfInput = new JTextField();
		tfInput.setBounds(26, 515, 425, 63);
		panel_2.add(tfInput);
		tfInput.setColumns(10);
		
		JButton btLogout = new JButton("Logout");
		btLogout.setForeground(new Color(255, 255, 0));
		btLogout.setBackground(new Color(30, 144, 255));
		btLogout.setFont(new Font("Serif", Font.BOLD, 26));
		btLogout.setBounds(26, 603, 425, 50);
		panel_2.add(btLogout);
		
		tfId.setBorder(new TitledBorder("Id"));
		tfId.setFont(new Font("sans-serif",Font.BOLD, 20));
		
		tfPw.setBorder(new TitledBorder("Password"));
		tfPw.setFont(new Font("sans-serif",Font.BOLD, 20));
		
		tfInput.setBorder(new TitledBorder("Message"));
		tfInput.setFont(new Font("sans-serif",Font.BOLD, 20));
		
		scrollPane.setBorder(new LineBorder(Color.blue, 3));
		
		taMsg.setFont(new Font("sans-serif",Font.BOLD, 20));
		taMsg.setEditable(false);//편집 불가
		
		btLogin.addActionListener(e->{
			String id=tfId.getText();
			char [] ch=tfPw.getPassword();
			String pw=new String(ch);
			//유효성 체크 id,pw번호값이 비어있다면 다이얼로그 띄우기
			//trim() : 문자열 앞,뒤의 공백문자를 제거해준다
			if(id==null||pw==null||id.trim().equals("")||pw.trim().isEmpty()) {
				JOptionPane.showMessageDialog(panel, "아이디와 비밀번호를 입력해야 해요");
				return;
			}
			
			//로그인 인증을 받았다면
			try {
				boolean isLogin=loginCheck(id, pw);
				if(isLogin) {
					this.loginId=id;
					this.isLogin=isLogin;
					setTitle(loginId+"님 로그인 중...");
					connectChat();//챗서버에 접속
					card.show(panel, "chatP");//챗 패널 보여주기
				}else {
					JOptionPane.showMessageDialog(panel, "로그인 인증에 실패했어요");
				}
			}catch(NotSupportedNameException ex) {
				JOptionPane.showMessageDialog(panel, ex.getMessage());
			}
		});
		
		btLogout.addActionListener(e->{
			
			out.println("##["+this.loginId+"님이 퇴장합니다]##");
			
			this.isLogin=false;
			this.loginId="";
			setTitle("::MyChat v1.1::");
			card.show(panel, "loginP");//로그인 패널 보여주기
			tfId.setText("");
			tfPw.setText("");
			tfId.requestFocus();
			taMsg.setText("");
			try {
				flag=true;//듣는 스레드 중지
				if(in!=null) in.close();
				if(out!=null) out.close();
				if(sock!=null) sock.close();
			}catch(Exception ex) {}
			
		});
		
		tfInput.addActionListener(e->{
			String msg=tfInput.getText();
			//서버에 내 메시지를 보내자
			
			out.println(msg);
			tfInput.setText("");
			
		});
		
	}//--------------------------------------
	
	
	/**채팅서버에 접속하는 메서드 */
	public void connectChat() {
		try {
			sock=new Socket(host,port);
			taMsg.append("##채팅 서버와 연결됨...###\n");
			in=new BufferedReader(new InputStreamReader(sock.getInputStream()));
			
			out=new PrintWriter(sock.getOutputStream(),true);
			out.println(loginId);//접속자 아이디를 서버에 보내자
			//서버가 보내온 메시지를 듣기위해 스레드 동작
			flag=false;
			Thread listener=new Thread(this);
			listener.start();
			
		} catch (Exception e) {
			taMsg.append("\n채팅 서버와 연결 실패: "+e);
		}
	}//----------------
	/**사용자 아이디,비번을 체크하여 로그인 처리하는 메서드*/
	public boolean loginCheck(String id, String pw) throws NotSupportedNameException 
	{
		//String
		//boolean startsWith(String prefix)
		//boolean endsWith(String suffix)
		if(id.startsWith("kong")||id.startsWith("콩")) {
			throw new NotSupportedNameException("콩씨는 절대로 로그인 불가!!!");
		}
		
		
		//userMap에 저장된 회원의 아이디와 비밀번호와 일치하지 않는다면 false반환
		//일치하면 true반환
		boolean isExist=userMap.containsKey(id);
		//setTitle("isExist: "+isExist);
		if(!isExist) return false;//아이디가 없는 경우
		
		//id가 존재한다면 비밀번호가 일치하는지 체크하자
		String realPw=userMap.get(id);
		if(!realPw.equals(pw)) return false;//비번이 일치하지 않는 경우
		
		//만약 로그인한 사람의 id가 kong이라면  사용자정의 예외를 발생시켜 "콩씨는 절대로 입장 못합니다" 다이얼로그 띄우기  
		return true;
	}//--------------------------------------
	
	/**서버가 보내오는 메시지를 듣고 taMsg에 메시지를 출력하는 스레드*/
	@Override
	public void run() {
		String serverMsg="";
		try {
			while(!flag) {
				serverMsg=in.readLine();
				if(serverMsg==null) return;
				taMsg.append(serverMsg+"\n");
				taMsg.setCaretPosition(taMsg.getText().length());
				//커서의 위치를 taMsg의 끝으로 이동
			}//while---
		}catch(Exception e) {
			taMsg.append("\n서버와 연결 끊김: "+e);
		}
		
	}//run()-------------------------

	public static void main(String[] args) {
		MyChatting my=new MyChatting();
		//my.setSize(500,700);
		my.setVisible(true);
	}
	
}