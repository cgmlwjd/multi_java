package day09;

import java.io.*;

import javax.swing.*;
//파일을 읽어서 콘솔에 파일내용을 출력하기
/* 		Object
* 			|
* 		Throwable		
* 		|		|
* Exception	  Error
* 		|
* 	IOException
* 		|
*  FileNotFoundException
* 
* */

public class FileIo {
	public static void main(String[] args) {
		String fname = JOptionPane.showInputDialog("읽을 파일명을 입력하세요");
		if(fname == null) return;
		System.out.println(fname);
		
		String content = reading(fname);
		System.out.println(content);
	}
	public static String reading(String fileName) {
		String str="";
		FileReader fr = null;
		char[] data = new char[1000];
		
		try {
			fr = new FileReader(fileName);
			//FileNotFoundException
			
			int n = 0;
			while((n = fr.read(data))!= -1) {
				String content = new String(data, 0, n);
				str += content;
			}
			
			fr.close(); //IOException
		} catch(FileNotFoundException e) {
			System.out.println(fileName + " 파일을 찾을 수 없어요");
		} catch(IOException e) {
			System.out.println("파일 입출력 중 에러 발생: " + e.getMessage());
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		return str;
	}

}
