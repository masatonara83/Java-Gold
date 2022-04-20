package iofile;

import java.io.Serializable;

public class ItemEx10 implements Serializable {
	private String name;
	private int price;
	
	public ItemEx10(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "ItemEx10 [name=" + name + ", price=" + price + "]";
	}
}
