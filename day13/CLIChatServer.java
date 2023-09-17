package day13;
import java.net.*;
import java.io.*;

/*1대 1 채팅 (Thread활용)
 * -콘솔 채팅
 * - 클라이언트 접속 기다린다.-ServerSocket, Socket
 * - 클이 보내오는 메시지를 듣는다.==> 스레드로 처리(Thread상속)
 * - 클에게 메시지를 보낸다(키보드 입력)
 * */
public class CLIChatServer extends Thread{
	
	private ServerSocket server;
	private Socket sock;
	
	BufferedReader in, key;
	PrintWriter out;
	
	final int port=7777;

	public CLIChatServer() {
		try {
			server=new ServerSocket(port);
			System.out.println("CLIChatServer Ready...");
			sock=server.accept();
			System.out.println("##클과 연결됨######");
			//1. 키보드 입력 스트림
			key=new BufferedReader(new InputStreamReader(System.in));			
			//2. 클에게 출력할 스트림
			out=new PrintWriter(sock.getOutputStream(), true);
			//3. 클이 보내오는 것을 듣는 스트림
			in=new BufferedReader(new InputStreamReader(
					sock.getInputStream()));
			//4. 스레드 동작 => 클이 보내오는 메시지를 계속 리스닝하여
			//   콘솔에 출력한다
			this.start();//this =>Thread를 상속받고 있다
			//5. 키보드 입력하여 클에게 메시지를 보낸다
			String msg="";
			while((msg=key.readLine())!=null) {
				out.println(msg);
			}//while----
		} catch (IOException e) {
			System.out.println(e);
			//e.printStackTrace();
		}finally {
			close();
		}
	}//생성자---------
	
	@Override
	public void run() {//리스너
		try {
			String cmsg="";
			while((cmsg=in.readLine())!=null) {
				System.out.println("From Client>>"+cmsg);
			}
			
		} catch (Exception e) {
			System.out.println("server run() : "+e);
		}finally {
			close();
		}
		
	}//run()----------
	
	public void close() {
		try {
			if(in!=null) in.close();
			if(key!=null) key.close();
			if(out!=null) out.close();
			if(sock!=null) sock.close();
			if(server!=null) server.close();
		} catch (Exception e) {}
	}//close()-------------------
	

	public static void main(String[] args) {
		new CLIChatServer();
	}

}

