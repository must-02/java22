package kodlamaioWebsite.entities;

public class Instructors {
	private String name;
	private int age;

	public Instructors(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Instructors() {
	}

	public String getName() {
		return name;
	}

	public void setInstructor(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
