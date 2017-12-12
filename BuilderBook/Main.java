package BuilderBook;

public class Main {

	public static void main(String[] args) {
		Book.Builder builder = new Book.Builder("A", 10000);

		Book b1 = builder.build();
		b1.printBook();
		System.out.println("price b1: " + b1.totalMoney());
	
		Book.Builder builder2 = new Book.Builder();
		Book b2 = builder2.setmName("A").setmPrice(10000).build();
		b2.printBook();
		System.out.println("price b2: " + b2.totalMoney());
		
	}
}
