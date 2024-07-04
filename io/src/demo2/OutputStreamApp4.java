package demo2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamApp4 {

	public static void main(String[] args) {
		
		String src = "src/demo2/sample.pdf";
		String dest = "src/demo2/sample_backup.pdf";
		
		try (InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dest)){
			
			long begin = System.currentTimeMillis();
			System.out.println("### 파일 읽고/쓰기를 시작합니다.");
			
//			소요시간 20초
//			int value = 0;
//			while ((value = in.read()) != -1) {
//				out.write(value);
//			}
			
//			소요시간 9밀리초;;
			byte[] buf = new byte[1024*8];
			int len = 0;
			while ((len = in.read(buf)) != -1) {
				out.write(buf, 0, len);
			}
			
			long end = System.currentTimeMillis();
			System.out.println("소요시간: " + (end - begin) + "밀리초");
			System.out.println("### 파일 읽고/쓰기를 종료합니다.");
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}