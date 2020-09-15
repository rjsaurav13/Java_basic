package javab;

class College {
	public void showinfo() {
		System.out.println("class contains 60 students");
	}
}

class Lab {
	public void showinfo() {
		System.out.println("lab contains 30 students");
	}
}

class Auditorium {
	public void showinfo() {
		System.out.println("Auditorium contains 200 students");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		College col = new College();
		Lab lab1 = new Lab();
		Auditorium audi = new Auditorium();
		col.showinfo();
		lab1.showinfo();
		audi.showinfo();
	}

}
