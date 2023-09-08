package day07;
import java.io.*;
/*
 * FileReader클래스
 * - 2byte (char) 단위로 파일 데이터를 읽어들임
 * - int read(char[] buf, int off, int len)
 * - int read(char[] buf)
 * */

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		File file=new File("20230907.txt");
		System.out.println("파일크기: "+file.length()+" bytes");
		
		char[] data=new char[10];
		
		FileReader fr=new FileReader(file);//파일과 노드 연결
		
		int n=0;
		//파일끝에 도달하면 -1을 반환
		while((n=fr.read(data))!=-1) {//파일의 끝이 아니면 계속 반복해서 읽어라
			String content=new String(data,0, n);
			System.out.println(content);
			System.out.println("n: "+n);
		}
		System.out.println(">>n: "+n);
		//int n=fr.read(data);
		//파일 내용은 data배열에 담겨 있다.
		//파일끝에 도달하면 -1을 반환한다.
		//System.out.println("n: "+n);
		fr.close();
		
		//System.out.println("data: "+data);
		//String contents=new String(data);
		//System.out.println(contents);
		
		
	}

}
