package demo1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamApp1 {

	public static void main(String[] args) {
		
		/*
		 * FileInputStream
		 * 	바이트 스트림
		 * 	읽기 전용 스트림
		 * 	파일의 데이터를 1byte씩 읽을 수 있다.
		 * 
		 * 	주요 메소드
		 * 		int read()
		 * 			스트림으로 1byte씩 읽어서 정수값으로 반환한다.
		 * 			스트림으로 끝에 도달하면 -1을 반환한다.
		 * 		int read(byte[] buf)
		 * 			스트림으로 1byte씩 읽어서 배열의 처음부터 하나씩 저장한다.
		 * 			배열이 가득채워지면 값(저장된 갯수)을 반환한다.
		 * 			스트림의 맨 마지막까지 읽으면 값(저장된 갯수)을 반환한다.
		 * 			스트림의 끝에 도달하면 -1을 반환한다.
		 */
		try(FileInputStream in = new FileInputStream("src/demo1/demo.txt")){
			
//			int value = 0;
//			while((value = in.read()) != -1) {
				
				/*
				 * 00000000 00000000 00000000 01100001
				 * 00000000 00000000 00000000 01100010
				 * 00000000 00000000 00000000 01100011
				 * 00000000 00000000 00000000 01100100
				 * 00000000 00000000 00000000 01100101
				 * 00000000 00000000 00000000 01100110
				 * 00000000 00000000 00000000 01100111
				 */
//				System.out.println(Integer.toBinaryString(value));
			
			byte[] buf = new byte[20];
			int len = 0;
			
			while((len = in.read(buf)) != -1) {
				System.out.println("길이: " + len);
				System.out.println("데이터: " + Arrays.toString(buf));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}