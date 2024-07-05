package demo5;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class ReaderApp2 {

	public static void main(String[] args) {
		
		try {
			URI uri = new URI("https://docs.oracle.com/en/java/javase/21/docs/api/index.html");
			URL url = uri.toURL();
			
			/*
			 * 1. InputStream 획득하기
			 * 	InputStream byteStream = url.openStream();
			 * 2. InputStream을 브릿지스트림과 연결하기
			 * 	InputStreamReader bridgeStream = new InputStreamReader(byteStream);
			 * 3. 브릿지스트림을 Reader와 연결하기
			 * 	BufferedReader reader = new BufferedReader(bridgeStream);
			 * 
			 */
			InputStream byteStream = url.openStream();
			InputStreamReader bridgeStream = new InputStreamReader(byteStream);
			BufferedReader reader = new BufferedReader(bridgeStream);
			
			String text = null;
			while((text = reader.readLine()) != null) {
				System.out.println(text);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}