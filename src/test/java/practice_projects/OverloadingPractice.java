package practice_projects;

public class OverloadingPractice {

	public static void main(String[] args) {

		subtract(150, 76, 40, 35);
		add(50, 50);
	}

	static void add(int a, int b) {
		System.out.println(a + b);

	}

	static void subtract(int c, int a, int b) {
		System.out.println(c - a + b);

	}

	static void subtract(int a, int b) {
		System.out.println(a - b);

	}

	static void subtract(int a, int b, int c, int d) {
		System.out.println(a + b - c + d);
	}

}