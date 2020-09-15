package javab;

class Animal {
	private String type;
	private int age;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class GetterWSetter {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.setType("dog");
		String type1 = animal.getType();
		System.out.println(type1);
		animal.setAge(5);
		int age1 = animal.getAge();
		System.out.println(age1);

	}

}
