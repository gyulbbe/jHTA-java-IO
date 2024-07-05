package demo4;

import java.io.IOException;
import java.io.PrintWriter;

public class WriterApp2 {

	public static void main(String[] args) {
		
		try {
			String file = "src/demo4/sample2.txt";
			PrintWriter out = new PrintWriter(file);
			
			out.println("김유신,100,100,100");
			out.println("홍길동,90,90,90");
			out.println("강감찬,100,100,100");
			
			out.flush();
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}