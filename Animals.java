package javab;

public enum Animals {
	DOG("tommy"), COW("john"), CAT("tom"), BULL("hunk");
	private String getname;

	Animals(String getname) {
		this.getname = getname;

	}
	public String getName() {
		return getname;
	}
}
