class BCE7 {
	public static void main(String[] args) {
		int x = 7;
		Product ref = new Product();
		ref.bill(x);
	}
}

class Product {
	void bill(int price) {
		int qty = 5;
		System.out.println(qty * price);
	}
}
