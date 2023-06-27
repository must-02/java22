package kodlamaioWebPage.entities;

public class Courses {
	private String[] courses = { "Java", "C# + Angular", ".Net", "JavaScript", "Java + React", "Temel Kurs" };
	private int price;

	public Courses(String[] courses,int price) {
		this.courses = courses;
		this.price = price;
	}

	public Courses() {

	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
