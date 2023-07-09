package kodlamaioWebsite;

import kodlamaioWebsite.business.BaseWebManager;
import kodlamaioWebsite.dataAccess.JdbcWebDao;
import kodlamaioWebsite.entities.Categories;
import kodlamaioWebsite.entities.Courses;
import kodlamaioWebsite.entities.Instructors;
import kodlamaioWebsite.logging.DatabaseLogger;
import kodlamaioWebsite.logging.FileLogger;
import kodlamaioWebsite.logging.Logger;
import kodlamaioWebsite.logging.MailLogger;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };
		BaseWebManager basewebmanager = new BaseWebManager(new JdbcWebDao(), loggers);
		Courses course = new Courses("java kursu", 5);
		Categories category = new Categories("web kategorisi");
		Instructors instructor = new Instructors("semih", 24);
		basewebmanager.addInstructor(instructor);
		//basewebmanager.addCategory(category);
		//basewebmanager.addCourse(course);

	}

}
