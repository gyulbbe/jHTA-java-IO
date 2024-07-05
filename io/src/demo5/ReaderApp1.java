package demo5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderApp1 {

	public static void main(String[] args) {
		
		String file = "src/demo5/sample.txt";
		
		try (BufferedReader in = new BufferedReader(new FileReader(file))) {
			
			String text = null;
			while((text = in.readLine()) != null) {
				// text -> "홍길동,100,80,70"
				// values -> {"홍길동", "100", "80", "70"}
				String[] values = text.split(",");
				
				String name = values[0];
				int kor = Integer.parseInt(values[1]);
				int eng = Integer.parseInt(values[2]);
				int math = Integer.parseInt(values[3]);
				int total = kor + eng + math;
				int average = total/3;
				
				System.out.println(name);
				System.out.println(kor);
				System.out.println(eng);
				System.out.println(math);
				System.out.println(total);
				System.out.println(average);
				System.out.println(name);
				System.out.println();
			}
			
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}
}