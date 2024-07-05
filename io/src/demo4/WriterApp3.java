package demo4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriterApp3 {

	public static void main(String[] args) {
		
		try {
			String file = "src/demo4/sample3.txt";
			PrintWriter out = new PrintWriter(new FileWriter(file), true);
			
			out.println("자동 flush 기능 지원");
			out.println("자동 flush 기능 지원");
			out.println("자동 flush 기능 지원");
			out.println("자동 flush 기능 지원");
			out.println("자동 flush 기능 지원");
			out.println("자동 flush 기능 지원");
			out.println("자동 flush 기능 지원");
			
			// print()와 write()는 자동 flush 기능이 true로 설정되어 있어도 지원되지 않는다.
			out.print("자동 flush 기능 미지원");
			out.print("자동 flush 기능 미지원");
			out.print("자동 flush 기능 미지원");
			out.print("자동 flush 기능 미지원");
			out.print("자동 flush 기능 미지원");
			out.print("자동 flush 기능 미지원");
			out.print("자동 flush 기능 미지원");
			
			out.flush();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}