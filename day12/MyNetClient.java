package day12;
import java.net.*;
import java.io.*;

public class MyNetClient {

public static void main(String[] args) throws IOException {
		Socket sock = new Socket("192.168.0.12", 5555);
		System.out.println("서버와 연결됨");
		InputStream is = sock.getInputStream();
		byte[] data = new byte[1024];
		
		int n = is.read(data);
		String str = new String(data, 0, n);
		System.out.println(str);
		
		OutputStream out = sock.getOutputStream();
		String sendMsg="반가워욥";
		byte[] sendData = sendMsg.getBytes();
		
		out.write(sendData);
		out.flush();
		
		
		is.close();
		sock.close();
	}

}
