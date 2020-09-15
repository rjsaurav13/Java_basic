package javab;

class School {
	public School() {
		System.out.println("school opened");
	}

	public School(int teacher) {
		System.out.println("teachers: " + teacher);
	}

	public School(int year1, int students) {
		System.out.println("year: " + year1 + " \nnumber of students:" + students);
	}
}

public class Constructors {
	public static void main(String[] args) {
		School school1 = new School();
		School school2 = new School(40);
		School school3 = new School(20, 500);
		System.out.println(school1+" "+school2+" "+school3);
	}

}
