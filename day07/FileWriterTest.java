package day07;
/*java.io패키지 
 * 파일 입출력 스트림
 * - 파일에 쓰기: FileOutputStream (1byte기반),  FileWriter (char기반-2byte기반)
 * 			   System.out
 * - 파일 읽기 : FileInputStream (1byte기반),    FileReader (char기반-2byte기반)
 * 				System.in
 * */
import java.io.*;
import java.util.*;
public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("일기장에 쓸 내용을 입력하세요=>");
		String line=sc.nextLine();//개행문자("\n") 를 만나기 전의 문자열을 반환한다
		System.out.println(line);
		
		//java.io.FileWriter의 메서드
		//public void write(String str,int off,int len) throws IOException
		FileWriter fw=new FileWriter("20230907.txt",true);//파일명, append여부 ==> 파일에 쓸 준비를 함
		//fw.write(line+"\n",0, line.length());
		fw.write(line+"\n");
		fw.flush();//스트림에 남아있는 데이터를 밀어내기해서 쓴다
		fw.close();
		System.out.println("파일에 쓰기 완료!!");
	}

}
