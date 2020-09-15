package javab;
class Factory{
	private String name;
	private int age;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factory other = (Factory) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public Factory(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
}
public class DotEquals {
	public static void main(String[] args) {
		Factory factory1=new Factory("ram",30);
		Factory factory2=new Factory("ram",30);
		System.out.println(factory1.equals(factory2));
	}

}
