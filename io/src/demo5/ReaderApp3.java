package demo5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderApp3 {

	public static void main(String[] args) {
		
		/*
		 * 키보드 입력을 한 줄씩 읽어오기
		 */
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("메시지를 입력하세요: ");
			String text = in.readLine();
			
			System.out.println("메시지: " + text);
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}