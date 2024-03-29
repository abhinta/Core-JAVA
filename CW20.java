abstract class Shape {
	abstract void area();

	void line() {
		System.out.println("-----------");
	}
};

class Rect extends Shape {
	void area() {
		System.out.println("Area of Rect");
	}

	void dline() {
		System.out.println("$$$");
	}
};

class Abstract {
	public static void main(String[] args) {
		Rect robj = new Rect();
		robj.area();
		robj.line();
		robj.dline();
		Shape ref = new Rect();
		ref.area();
		ref.line();
		((Rect) ref).dline();
		System.out.println("Hello World!");
	}
}
