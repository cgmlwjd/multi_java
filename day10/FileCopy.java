package day10;
import java.io.*;
import java.util.*;

/*InputStream/OutputStream      |      Reader/Writer
 * ---------------------------------------------------
 * 1byte기반 데이터를 읽고 쓴다 |    2byte기반(char)
 * FileInputStream              |      FileReader
 * FileOutputStream             |      FileWriter
 * PrintStream                  |      PrintWriter
 * ....
 * 
 * 예외를 throws로 선언해보세요
 * */

public class FileCopy {
	
	public static void Imagecopy(String src, String target) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		fis = new FileInputStream(src);
		fos = new FileOutputStream(target);
		
		int n = 0;
		byte data[] = new byte[1024]; //파일 데이터를 담을 배열
		int total=0;
		while((n = fis.read(data)) != -1) {
			fos.write(data, 0, n);
			fos.flush();
			System.out.println("n : " + n);
			total += n;
		}
		
		System.out.println("총 " + total + "bytes 파일 카피 완료!");
		if(fis != null) fis.close();
		if(fos != null) fos.close();
	}

	public static void main(String[] args) throws IOException {
		//C:/multicampus/JavaWorkspace/Begin/src/day09/icon1.png
		//C:/multicampus/JavaWorkspace/Begin/src/day010/icon1_copy.png
		Scanner sc = new Scanner(System.in);
		System.out.println("카피할 원본 파일명을 입력하세요 => ");
		String file1 = sc.nextLine();
		
		System.out.println("카피할 목적 파일명을 입력하세요 => ");
		String file2 = sc.nextLine();
		
		System.out.println(file1 + "파일을 " + file2 + "로 카피합니다.");
		
		try {
			FileCopy.Imagecopy(file1, file2);
		} catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다!" + e.getMessage());
		}
		
		
		sc.close();
	}

}
