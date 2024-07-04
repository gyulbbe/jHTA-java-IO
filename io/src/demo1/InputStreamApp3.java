package demo1;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamApp3 {

	public static void main(String[] args) {
		
		String file = "src/demo1/demo.txt";
		try (FileInputStream in = new FileInputStream(file)) {
			
			byte[] buf = new byte[20];
			int len = 0;
			
			while((len = in.read(buf)) != -1) {
				/*
				 * String의 API
				 * 	new String(byte[] arr, int offset, int length)
				 * 		arr: byte배열 데이터
				 * 		offset: 시작위치
				 * 		length: 길이
				 * 		byte배열에서 offset 위치부터 length만큼 읽어서 문자열로 변환한 String 객체를 생성한다.
				 */
				String text = new String(buf, 0, len);
				System.out.println(text);
			}
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}