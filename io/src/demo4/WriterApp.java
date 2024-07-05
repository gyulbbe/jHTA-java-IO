package demo4;

import java.io.IOException;
import java.io.PrintWriter;

public class WriterApp {

	public static void main(String[] args) {
		
		/*
		 * PrintWriter
		 * 	텍스트 전용 스트림이다.
		 * 	주요 API
		 * 		생성자 메소드
		 * 			new PrintWriter(String filename)
		 * 				저장된 파일명에 해당하는 파일과 연결되는 스트림을 생성한다.
		 * 			new PrintWriter(File file)
		 * 				지정된 File객체가 표현하는 파일과 연결되는 스트림을 생성한다.
		 * 			new PrintWriter(OutputStream out, boolean authFlush)
		 * 				지정된 바이트스트림과 연결된 스트림을 생성하고, 자동 flush기능을 설정할 수 있다.
		 * 			new PrintWriter(Writer out, boolean authFlush)
		 * 				지정된 문자스트림과 연결된 스트림을 생성하고 자동 flush 기능을 설정할 수 있다.
		 * 
		 * 		멤버 메소드
		 * 			void write(String text)
		 * 			void print(String text)
		 * 
		 * 			void println(String text)
		 * 				줄바꿈문자 자동 추가
		 * 				자동 flush기능 적용받음
		 * 				위에 두개는 안됨
		 */
		
		String file = "src/demo4/sample.txt";
		try (PrintWriter out = new PrintWriter(file)){
			
			out.println("줄바꿈문자를 자동으로 추가한다.");
			out.println("자동 flush");
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
