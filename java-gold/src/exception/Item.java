package exception;

public class Item {

	private String name;
	private int price;
	
	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		//事前条件確認
		assert name != null : "name is null";
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		//事前条件確認
		assert price > 0 : "invalid price :" + price;
		this.price = price;
	}
	
	
}
