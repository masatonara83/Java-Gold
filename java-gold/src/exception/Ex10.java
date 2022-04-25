package exception;

public class Ex10 {

	public static void main(String[] args) {
		Item item = new Item("apple", 100);
		item.setName(null);
		item.setPrice(-1);
		
		System.out.println(item.getName() + ":" + item.getPrice());
	}
}
