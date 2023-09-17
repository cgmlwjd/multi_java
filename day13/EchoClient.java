package day13;

import java.net.*;
import java.io.*;

public class EchoClient {

	public static void main(String[] args) {
		try {
			String ip = "127.0.0.1";
			final int port = 7000;
			Socket sock = new Socket(ip, port);
			System.out.println("서버와 연결됨");
			PrintWriter out = new PrintWriter(sock.getOutputStream(), true);
			BufferedReader in = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			
			BufferedReader key = new BufferedReader(
					new InputStreamReader(System.in));
			
			
			String serverMsg = in.readLine();
			System.out.println("From Server >> " + serverMsg);
			
			String cMsg="";

			while((cMsg = key.readLine()) != null){
				//out.println(cMsg);
				System.out.println("From Client>> " + cMsg);
				out.println(cMsg);
				
				serverMsg = in.readLine();
				System.out.println("From Server>> " + serverMsg);
			}
			
			if(in != null) {
				in.close();
			}
			
			if(key != null) {
				key.close();
			}
			
			if(out != null) {
				out.close();
			}
			
			if(sock != null) {
				sock.close();
			}
		} catch(IOException e) {
			System.out.println("클 예외: " + e);
		}
	}

}
