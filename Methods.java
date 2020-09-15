package javab;

class Calculator {
	public void add() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}

	public int sub() {
		int c = 25;
		int d = 10;
		return c - d;
	}
}

public class Methods {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add();
		int z = calc.sub();
		System.out.println(z);
	}

}
