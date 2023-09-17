package mychat;
import java.net.*;
import java.io.*;
import java.util.*;
public class ChatHandler extends Thread {

	Socket sock;
	ArrayList<ChatHandler> userList;
	BufferedReader in;
	PrintWriter out;
	boolean isStop=false;
	public ChatHandler(Socket sock, ArrayList<ChatHandler> arr) {
		
		this.sock=sock;
		this.userList=arr;
		try {
		in=new BufferedReader(new InputStreamReader(this.sock.getInputStream()));
		out=new PrintWriter(sock.getOutputStream(),true);
		}catch(Exception e) {
			System.out.println("Error: "+e);
		}
	}//---------------------
	public void run() {
		try {
			String chatId=in.readLine();
			System.out.println(chatId+"님 입장함");
			//모든 접속자에게 입장한 사람을 쏴주자
			String sendMsg="##["+chatId+"]님이 입장했습니다##";
			broadcast(sendMsg);
			while(!isStop) {
				String cmsg=in.readLine();
				broadcast(chatId+">>"+cmsg);
				if(cmsg.startsWith("##[")&&cmsg.contains("퇴장")) {
					isStop=true;
					if(in!=null) in.close();
					if(out!=null) out.close();
					if(sock!=null) sock.close();
					userList.remove(this);
					//퇴장하는 이와 통신하는 챗핸들러를 userList에서 삭제
					break;
				}
				
			}//while-----
		}catch(Exception e) {
			System.out.println("run() error: "+e);
		}
	}//run()-------------------
	/**모든 접속자에게 메시지를 보내는 메서드*/
	public synchronized void broadcast(String sendMsg) {
		if(userList==null) return;
		for(ChatHandler chat:userList) {
			chat.out.println(sendMsg);
		}//for----		
	}//----------------------------

}
