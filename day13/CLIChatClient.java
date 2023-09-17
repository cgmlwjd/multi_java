package day13;
import java.net.*;
import java.io.*;

/* -서버에 접속한다-Socket(ip,port)
 * -서버에 메시지를 보낸다.
 * -서버가 보내오는 메시지를 듣는다.==>스레드로 처리 (Runnable 상속)
 * */
public class CLIChatClient implements Runnable{
	
	private Socket sock;
	
	BufferedReader in, key;
	PrintWriter out;
	
	final int port=7777;

	public CLIChatClient() {
		//1. Socket생성-ip,port
		try {
			sock=new Socket("localhost",port);
			System.out.println("###챗 서버와 연결됨###");
			//2. 키보드 입력 스트림
			key=new BufferedReader(new InputStreamReader(System.in));
			//3. 서버에 출력하는 스트림
			out=new PrintWriter(sock.getOutputStream(), true);
			//4. 서버 메시지를 들을 스트림
			in=new BufferedReader(new InputStreamReader(
					sock.getInputStream()));
			//5. 스레드 동작 => 서버가 보내오는 메시지를 리스닝하여 콘솔에 출력
			//Runnable객체 먼서 생성
			//this가 Runnable객체
			
			//Thread생성=> 러너블 객체를 인자로
			Thread listener=new Thread(this);
			//스레드 start
			listener.start();
			//6. 키보드 입력하여 서버에게 메시지 보낸다
			String mymsg="";
			while((mymsg=key.readLine())!=null) {
				out.println(mymsg);
			}
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			close();
		}
	}//생성자----
	
	@Override
	public void run() {
		//서버가 보내오는 메시지를 계속 듣고, 콘솔에 출력하자
		try {
			String sMsg="";
			while((sMsg=in.readLine())!=null) {
				System.out.println("From Server>>"+sMsg);
			}
		} catch (Exception e) {
			System.out.println("client run(): "+e);
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
		} catch (Exception e) {}
	}//close()-------------------

	public static void main(String[] args) {
		new CLIChatClient();

	}

}
