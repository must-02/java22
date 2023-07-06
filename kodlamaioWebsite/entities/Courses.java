package kodlamaioWebsite.entities;

public class Courses {
	private String name;
	private int price;

	public Courses(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Courses() {

	}

	public String getName() {
		return name;
	}

	public void setCourses(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
