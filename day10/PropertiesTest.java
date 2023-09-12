package day10;
/*Map계열
 * Properties
 * xxx.properties 유형의 파일을 읽어서 해당 파일에 저장된 내용을 자바로
 * 옮기고자 할 때 사용한다.
 * 
 * */
import java.io.*;
import java.util.*;
public class PropertiesTest {

	public static void main(String[] args) throws IOException{
		String file="src/day10/database.properties";
		FileInputStream fis=new FileInputStream(file);
		
		Properties prop=new Properties();
		prop.load(fis);
		//properties파일 내용을 읽어서 Properties객체로 옮겨 놓는다
		fis.close();
		
		String db=prop.getProperty("DbType");
		System.out.println(db);
		
		System.out.println(prop.getProperty("DbUrl"));
		
		System.out.println(prop.getProperty("DbUser"));
		
		System.out.println(prop.getProperty("DbPwd"));
		
		System.out.println(prop.getProperty("Msg","디폴트 메시지 입니다."));

	}

}

