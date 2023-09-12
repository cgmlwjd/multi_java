package mychat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.*;

public class MyChatting extends JFrame {
	private JTextField tfId;
	private JPasswordField tfPw;
	private JTextField tfInput;
	
	CardLayout card;
	JPanel panel = new JPanel();
	JPanel panel_1 = new JPanel();
	JPanel panel_2 = new JPanel();
	HashMap<String, String> userMap = new HashMap<>();
	
	public MyChatting() {
		super("::MyChatting::");
		
		this.setSize(500, 700);
		
		//임의의 회원정보 저장
		userMap.put("pong", "123");
		userMap.put("hong", "abc");
		userMap.put("admin", "tiger");
		
		panel.setBackground(SystemColor.activeCaption);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(card = new CardLayout(0, 0));
		
		
		
		panel_1.setBackground(new Color(255, 255, 0));
		panel.add(panel_1, "loginP");
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("My Talk");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setBounds(57, 77, 362, 81);
		panel_1.add(lblNewLabel);
		
		tfId = new JTextField();
		tfId.setBounds(67, 176, 353, 86);
		panel_1.add(tfId);
		tfId.setColumns(10);
		
		tfPw = new JPasswordField();
		tfPw.setBounds(66, 293, 353, 86);
		panel_1.add(tfPw);
		
		JButton bLogin = new JButton("Login");
		bLogin.setForeground(new Color(255, 255, 0));
		bLogin.setBackground(new Color(139, 69, 19));
		bLogin.setFont(new Font("굴림", Font.PLAIN, 26));
		bLogin.setBounds(67, 443, 357, 81);
		panel_1.add(bLogin);
		
		
		
		panel.add(panel_2, "chatP");
		panel_2.setLayout(null);
		
		JTextArea taMsg = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(taMsg);
		scrollPane.setBounds(30, 30, 420, 460);
		panel_2.add(scrollPane);
		
		tfInput = new JTextField();
		tfInput.setBounds(45, 507, 388, 78);
		panel_2.add(tfInput);
		tfInput.setColumns(10);
		
		JButton btLogout = new JButton("Logout");
		btLogout.setFont(new Font("굴림", Font.PLAIN, 20));
		btLogout.setBackground(new Color(128, 0, 0));
		btLogout.setForeground(new Color(255, 255, 0));
		btLogout.setBounds(45, 599, 389, 54);
		panel_2.add(btLogout);
		
		tfId.setBorder(new TitledBorder("ID"));
		tfId.setFont(new Font("sans-serif", Font.BOLD, 20));
		
		tfPw.setBorder(new TitledBorder("Password"));
		tfPw.setFont(new Font("sans-serif", Font.BOLD, 20));
		
		tfInput.setBorder(new TitledBorder("Message"));
		tfInput.setFont(new Font("sans-serif", Font.BOLD, 20));
		
		scrollPane.setBorder(new LineBorder(Color.blue, 3));
		
		taMsg.setFont(new Font("sans-serif", Font.BOLD, 20));
		taMsg.setEditable(false); //편집 불가
		
		bLogin.addActionListener(e -> {
			String id = tfId.getText();
			//String pw = tfPw.getText();
			char[] ch = tfPw.getPassword();
			String pw = new String(ch);
			//boolean isLogin;
//			try {
//				isLogin = loginCheck(id, pw);
//			} catch (NotSupportedNameException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
			//유효성체크 id, pw 번호값이 비어있다면 다이얼로그 띄우기
			//trim(): 문자열 앞, 뒤의 공백문자를 제거해준다
			
			if(id == null || pw == null || id.trim().equals("") || pw.trim().isEmpty()) {
				JOptionPane.showMessageDialog(panel, "아이디와 비밀번호를 입력해야 해요");
				return;
			}
			
			//로그인 인증을 받았다면
			try {
				boolean isLogin = loginCheck(id, pw);
				if(isLogin) {
					card.show(panel, "chatP");
				} else {
					JOptionPane.showMessageDialog(panel, "로그인 인증에 실패했어요");
				}
			} catch(NotSupportedNameException ex) {
				JOptionPane.showMessageDialog(panel, ex.getMessage());
			}
				
			
		});
		
		btLogout.addActionListener(e -> {
			card.show(panel,  "loginP"); //login 패널 보여주기
		});
	}

	private boolean loginCheck(String id, String pw) throws NotSupportedNameException {
		//String
		//boolean startsWith(String prefix)
		//boolean endWith(String suffix)
		if(id.startsWith("kong") || id.startsWith("콩")) {
			throw new NotSupportedNameException("콩씨는 절대로 로그인 불가");
		}
		//userMap에 저장된 회원의 아이디와 비밀번호가 일치하지 않는다면 false변환
		//일치하면 true변환
		boolean isExist = userMap.containsKey(id);
		if(!isExist) return false; //아이디가 없는 경우
		String realPw = userMap.get(id);
		if(!realPw.equals(pw))
			return false; //비번이 일치하지 않는 경우
		return true;
		
	}

	public static void main(String[] args) {
		MyChatting my = new MyChatting();
		// my.setSize(500, 700);
		my.setVisible(true);
	}
}
