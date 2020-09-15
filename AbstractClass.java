package javab;
abstract class Getschool{
	public abstract void showname();
	public abstract void showage();
}
class Getstudent extends Getschool {

	
	public void showname() {
		System.out.println("ram");
	}


	public void showage() {
		System.out.println("24");
		
	}
	
}
public class AbstractClass {
	public static void main(String[] args) {
		Getstudent stu=new Getstudent();
		stu.showname();
		stu.showage();
	}
}
