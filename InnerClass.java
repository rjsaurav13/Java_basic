package javab;
class Hello{
	public void hello() {
		System.out.println("hello,,,");
		
	}
	class Bye{
		public void bye() {
			System.out.println("ba bye.......");
		}
	}
}
public class InnerClass {
	public static void main(String[] args) {
		Hello obj1=new Hello();
		Hello.Bye obj2= obj1.new Bye();
		obj1.hello();
		obj2.bye();		
	}
}
