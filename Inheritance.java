package javab;

public class Inheritance extends Inheritance2 {
	public void show() {
		System.out.println("post: " + post + "\nworking tenure: " + wtenure);

	}

	public static void main(String[] args) {
		Inheritance inheri = new Inheritance();
		inheri.show();
	}
}
