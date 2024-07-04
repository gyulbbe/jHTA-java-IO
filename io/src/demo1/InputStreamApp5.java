package demo1;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

public class InputStreamApp5 {

	public static void main(String[] args) {
		
		try {
			/*
			 * URL 객체
			 * 	웹사이트 자원의 물리적 위치를 표현하는 객체
			 * 	URL객체는 해당 자원을 읽어올 수 있는 스트림 객체를 제공한다.
			 * 	주요 api
			 * 		InputStream openStream()
			 * 			URL이 표현하는 해당 자원을 읽어 올 수 있는 스트림객체를 반환한다.
			 * 		획득된 InputStream객체의
			 * 			int read() 혹은 int read(byte[] buf)를 이용하면 자바 애플리케이션에서 해당 자원의 정보를 읽어올 수 있다.
			 */
			
			// 웹상의 특정 자원을 나타내는 URI 객체를 생성한다.
			URI uri = new URI("https://docs.oracle.com/en/java/javase/21/docs/api/index.html");
			// URI 객체가 표현하는 정보가 특별히 해당 자원의 물리적인 위치를 나타내고 있다면, URL객체로 변환한다.
			URL url = uri.toURL();
			
			InputStream in = url.openStream();
			
			byte[] buf = new byte[1024*8];
			int len = 0;
			
			StringBuilder builder = new StringBuilder();
			while((len = in.read(buf)) != -1) {
				String text = new String(buf, 0, len);
				builder.append(text);
			}
			
			String document = builder.toString();
			System.out.println(document);
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}