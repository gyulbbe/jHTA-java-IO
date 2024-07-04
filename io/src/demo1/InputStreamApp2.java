package demo1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamApp2 {

	public static void main(String[] args) {
		
		String file = "src/demo1/demo.txt";
		try(FileInputStream in = new FileInputStream(file)){
			
			byte[] buf = new byte[20];
			
//			int len = in.read(buf);
			
//			System.out.println("길이: " + len); // 7
//			System.out.println("데이터: " + Arrays.toString(buf));
//			
//			len = in.read(buf);
//			System.out.println("길이: " + len); // -1 <- 더이상 읽을 것이 없음
			
			int len = 0;
			
			while((len = in.read(buf)) != -1) {
				System.out.println("길이: " + len);
				System.out.println("데이터: " + Arrays.toString(buf));
			}
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}