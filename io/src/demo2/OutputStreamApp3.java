package demo2;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

public class OutputStreamApp3 {

	public static void main(String[] args) {

		String file = "src/demo2/sample.jpg";
		try (FileOutputStream out = new FileOutputStream(file)){
			URI uri = new URI("https://cdnimg.melon.co.kr/resource/image/cds/musicstory/imgUrl20240703101331785.jpg");
			URL url = uri.toURL();
			InputStream in = url.openStream();
			
			int value = 0;
			while ((value = in.read()) != -1) {
				out.write(value);
			}
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}