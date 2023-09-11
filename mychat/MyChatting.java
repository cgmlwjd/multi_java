package mychat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class MyChatting extends JFrame {
	private JTextField tfId;
	private JPasswordField tfPw;
	private JTextField tfInput;
	
	CardLayout card;
	JPanel panel = new JPanel();
	JPanel panel_1 = new JPanel();
	JPanel panel_2 = new JPanel();
	
	public MyChatting() {
		super("::MyChatting::");
		
		this.setSize(500, 700);
		
		
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
		tfPw.setBorder(new TitledBorder("Password"));
		tfInput.setBorder(new TitledBorder("Message"));
		
		scrollPane.setBorder(new LineBorder(Color.blue, 3));
		
		bLogin.addActionListener(e -> {
			//로그인 인증을 받았다면
			card.show(panel, "chatP"); //챗 패널 보여주기
		});
		
		btLogout.addActionListener(e -> {
			card.show(panel,  "loginP"); //login 패널 보여주기
		});
	}

	public static void main(String[] args) {
		MyChatting my = new MyChatting();
		my.setSize(500, 700);
		my.setVisible(true);
	}
}
