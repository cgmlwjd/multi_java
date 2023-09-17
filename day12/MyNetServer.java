package day12;

import java.io.*;
import java.net.*;

public class MyNetServer {

	public static void main(String[] args) throws IOException{
		final int port = 5555;
		
		ServerSocket server = new ServerSocket(port);
		System.out.println("클라이언트 연결 기다림");
		
		while(true) {
			Socket sock = server.accept();
			System.out.println("클라이언트가 접속했어요");
			InetAddress ip = sock.getInetAddress();
			System.out.println("클의 IP: " + ip.getHostAddress());
			
			OutputStream os = sock.getOutputStream();
			
			int num = (int)(Math.random() * 100 + 1);
			String msg = "안녕하세요~ 행운의 번호를 보냅니다!!" + num;
			byte[] data = msg.getBytes();
			
			os.write((data));
			os.flush();
			
			InputStream in = sock.getInputStream();
			byte[] rcvData = new byte[500];
			int n = in.read(rcvData);
			
			String str = new String(rcvData, 0, n);
			System.out.println("From Client>> " + str);
			
			if(in!=null) in.close();
			
			if(os != null) {
				os.close();
			}
			if(sock != null) {
				sock.close();
			}
		}
	}

}
