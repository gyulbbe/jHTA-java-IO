package demo2;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamApp2 {

	public static void main(String[] args) {
		
		String file = "src/demo2/demo.txt";
		try (FileOutputStream out = new FileOutputStream(file)){
			
			String text = "Java@ Platform, Standart Edition & Java Development Kit";
			byte[] bytes = text.getBytes();
			out.write(bytes);
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}
}
