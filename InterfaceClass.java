package javab;

interface Scooter {
	public void sname();

	public void milage();
}

class Activa implements Scooter {

	public void sname() {
		System.out.println("scooter name is activa");

	}

	public void milage() {
		System.out.println("milage:-20km/L");

	}

}

class Jupiter implements Scooter {

	public void sname() {
		System.out.println("scooter name is jupiter");

	}

	public void milage() {
		System.out.println("milage:-20km/L");

	}

}

public class InterfaceClass {
	public static void main(String[] args) {
		Activa act = new Activa();
		act.sname();
		act.milage();
		Jupiter jupiter = new Jupiter();
		jupiter.sname();
		jupiter.milage();
	}

}
