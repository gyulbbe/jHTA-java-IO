package demo6;

import java.io.Serializable;

public class Car implements Serializable{

	private static final long serialVersionUID = 2L;
	private String name;
	private int year;
	private int price;
	
	public Car() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}