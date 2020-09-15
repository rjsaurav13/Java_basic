package javab;

public class StaticvFinal {
	public static int age;

	public static void getinfo(int weight) {
		System.out.println("weight is: " + weight);
	}

	public static void main(String[] args) {
		StaticvFinal.age = 20;
		System.out.println("age: " + age);
		StaticvFinal.getinfo(80);
	}

}
