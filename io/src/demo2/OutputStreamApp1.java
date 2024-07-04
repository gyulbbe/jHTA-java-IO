package demo2;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamApp1 {

	public static void main(String[] args) {
		
		/*
		 * FileOutputStream
		 * 	바이트스트림이다.
		 * 	출력전용 스트림이다.
		 * 	객체 생성시 지정한 파일에 데이터를 출력(기록, 쓰기)한다.
		 * 	객체 생성시 지정한 파일이 존재하지 않아도 오류가 발생하지 않는다.
		 * 	파일이 존재하지 않으면 파일을 새로 생성하고 기록한다.
		 */
		String file = "src/demo2/demo.txt";
		try(FileOutputStream out = new FileOutputStream(file)){
			
			out.write('a');
			out.write('a');
			out.write('a');
			out.write('a');
			out.write('a');
			out.write('a');

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
