package javab;

class people {
	public void getname(String name) {
		System.out.println("Name: " + name);
	}

	public void getage(int age) {
		System.out.println("age: " + age);
	}
}

public class MethodParaMeter {
	public static void main(String[] args) {
		people people1 = new people();
		people1.getname("ram");
		people1.getage(40);
	}

}
