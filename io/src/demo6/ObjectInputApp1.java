package demo6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputApp1 {

	public static void main(String[] args) {
		
		
		String file = "src/demo6/customer.sav";
		
		try (FileInputStream fis = new FileInputStream(file);
				ObjectInputStream in = new ObjectInputStream(fis);) {
			
			Object obj = in.readObject();
			Customer customer = (Customer) obj;
			Car car = customer.getCar();
			
			System.out.println(customer.getNo());
			System.out.println(customer.getId());
			System.out.println(customer.getPassword());
			System.out.println(car.getName());
			System.out.println(car.getPrice());
			System.out.println(car.getYear());
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}
