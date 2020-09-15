package javab;

public class Modifiersv1 {
	private int age = 40;
	private int tenure = 15;

	public static void main(String[] args) {
		ModifiersV2 mod2 = new ModifiersV2();
		Modifiersv1 mod = new Modifiersv1();

		System.out.println("work tenure: " + mod.tenure + " age: " + mod.age);
		System.out.println("Name: " + mod2.name + " Position: " + mod2.position);

	}
}
