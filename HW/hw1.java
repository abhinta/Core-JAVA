class great {
	int great(int a, int b, int c) {
		// this is constructor no more
		// only valid in java, not in cpp
		int m = (a > b ? (a > c ? a : c) : b > c ? b : c);
		return m;
	}
};

public class hw1 {
	public static void main(String[] args) {
		int a, b, c;
		a = 10;
		b = 9;
		c = 7;
		great ref = new great();
		int max = ref.great(a, b, c);
		System.out.println(max);
	}
}
