package javab;

class Bio {
	private String name;
	private int age;
	private String work;

	public Bio(String name, int age, String work) {
		this.name = name;
		this.age = age;
		this.work = work;
	}

	public String toString() {
		StringBuilder text = new StringBuilder();
		text.append("name: ").append(name).append(" age :").append(age).append(" work:").append(work);
		return text.toString();
	}
}

public class ToStrinG {
	public static void main(String[] args) {
		Bio b1 = new Bio("ram", 29, "engineer");
		Bio b2 = new Bio("sham", 39, "doctor");
		System.out.println(b1);
		System.out.println(b2);
	}

}
