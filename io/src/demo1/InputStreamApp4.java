package demo1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamApp4 {

	public static void main(String[] args) {
		
		String file = "src/demo1/sample.png";
		
		try (FileInputStream in = new FileInputStream(file)) {
			
			byte[] buf = new byte[1024*8];
			int len = 0;
			
			while ((len = in.read(buf)) != -1) {
				System.out.println("길이: " + len);
				System.out.println("데이터: " + Arrays.toString(buf));
			}
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
