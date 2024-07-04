package demo3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedApp1 {

	public static void main(String[] args) {
		
		/*
		 * BufferedInputStream, BufferedOutputStream
		 * 	보조 스트림
		 * 	읽기/쓰기 성능을 향상시키는 내부 저장소를 가지고 있는 스트림이다.
		 * 	다른 스트림과 연결해서 사용하면 읽기/쓰기 성능이 개선된다.
		 * 	보조 스트림과 다른 스트림 연결하기
		 * 		보조 스트림의 생성자 메소드의 매개변수로 연결할 스트림을 전달받는다.
		 *                   |---------------------------------------
		 * 	FileInputStream fis = new FileInputStream("sample.pdf");|
		 * 	BufferedInputStream bis = new BufferedInputStream(fis); |
		 * 					                                   ㄴ-----
		 */
		
		String src = "src/demo3/sample.pdf";
		String dest = "src/demo3/sample_backup.pdf";
		
		try (
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest))) {
			
			System.out.println("### 파일 읽고/쓰기를 시작합니다.");
			long begin = System.currentTimeMillis();
			
//			소요시간 209밀리초
			int value = 0;
			while ((value = in.read()) != -1) {
				out.write(value);
			}
			
			long end = System.currentTimeMillis();
			System.out.println("소요시간: " + (end - begin) + "밀리초");
			System.out.println("### 파일 읽고/쓰기를 종료합니다.");
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
