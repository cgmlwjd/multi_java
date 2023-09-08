package day07;
import java.io.*;

public class FileTest {

	public static void main(String[] args) {
		File file1=new File("20230907.txt");
		
		System.out.println("file1 파일 존재 여부: "+file1.exists());
		
		File file2=new File("src/day07/Cafe.java");
		
		System.out.println("file2 파일 존재 여부: "+file2.exists());
		System.out.println("file2 디렉토리 여부: "+file2.isDirectory());
		System.out.println("file2 파일  여부: "+file2.isFile());
		System.out.println("file2.getPath(): "+file2.getPath());//상대경로
		System.out.println("file2.getAbsolutePath(): "+file2.getAbsolutePath());//절대 경로
		
		
		File file3=new File("src/sample");
		System.out.println("file3 디렉토리 여부: "+file3.isDirectory());
		if(!file3.exists()) {
			boolean b=file3.mkdirs();//디렉토리들을 생성한다
			System.out.println("생성 여부: "+b);
		}
		//boolean b2=file3.delete();//파일,디렉토리를 삭제함
		//System.out.println("삭제 여부: "+b2);

	}

}
