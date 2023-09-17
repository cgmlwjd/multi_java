package day13;
import java.io.*;

/*키보드로 입력한 내용을
 * 콘솔에 출력해보자
 * 
 * 데이터소스([키보드],파일,컴퓨터)
 * : 키보드==>System.in =>InputStream타입 (1byte기반)
 * ==>InputStreamReader (2byte로 조합하여 읽는다)
 * ==>BufferedReader (버퍼에 모아서 읽어들이며, 줄단위로 입력받는 메서드가 있다:readLine())
 * 
 * 데이터목적지([콘솔],파일,컴퓨터,프린터)
 * : 콘솔 ==>System.out => PrintStream타입
 * ==>OutputStreamWriter
 * ==>BufferdWriter
 * 
 * PrintWriter : 2byte기반
 *  - write()
 *  - println()
 *  - 생성할때 true를 넣어주면  뉴라인(\n)을 만났을 때 자동으로 flush()를 해준다-auto flush기능
 * */

public class StandardInOut2 {

	public static void main(String[] args) throws IOException {
		System.out.println("내용을 입력하세요");
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		PrintWriter out = new PrintWriter(System.out, true);
		String line="";
		while((line = key.readLine()) != null) {
//			out.write(line + "\n");
//			out.flush();
			out.println(line);
		}
		
		key.close();
		out.close();
		System.in.close();
		System.out.close();
	}
}
