package kodlamaioWebsite.logging;

import kodlamaioWebsite.entities.Categories;
import kodlamaioWebsite.entities.Courses;
import kodlamaioWebsite.entities.Instructors;

public class MailLogger implements Logger {

	@Override
	public void CategoryLogger(Categories category) {
		System.out.println(" logged to mail");
	}

	@Override
	public void CourseLogger(Courses course) {
		System.out.println(" logged to mail");
	}

	@Override
	public void InstructorLogger(Instructors instructor) {
		System.out.println(" logged to mail");

	}

}
