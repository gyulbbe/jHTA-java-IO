package demo6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputApp1 {

	public static void main(String[] args) {

		// 객체 생성
		Car car = new Car();
		car.setName("제네시스");
		car.setPrice(6000000);
		car.setYear(2024);

		// 객체 생성
		Customer customer = new Customer();
		customer.setNo(100);
		customer.setId("hong");
		customer.setPassword(1234);
		customer.setName("홍길동");
		customer.setEmail("hong@gmail.com");
		customer.setTel("010-1111-1111");

		String file = "src/demo6/custom.sav";

		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream out = new ObjectOutputStream(fos);

			//객체를 직렬화한다.
			out.writeObject(customer);

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}