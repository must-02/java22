package kodlamaioWebsite;

import kodlamaioWebsite.business.WebManager;
import kodlamaioWebsite.entities.Courses;

public class Main {

	public static void main(String[] args) {
		WebManager webmanager = new WebManager(null, null, null, null, null);
		Courses course = new Courses();
		webmanager.addName();
	}

}
