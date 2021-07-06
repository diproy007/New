package practice_projects;

public class VariableExample {

	int a = 10; // Instance variable
	static int b = 50; // static or class variable

	public static void main(String[] args) {

		VariableExample obj = new VariableExample();  //?????
		System.out.println(obj.a);

		int c = 20; // local variable
		System.out.println(b+c);
		System.out.println(c);

	}

}
