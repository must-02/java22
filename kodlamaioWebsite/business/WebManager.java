package kodlamaioWebsite.business;

import kodlamaioWebsite.dataAccess.WebDao;
import kodlamaioWebsite.entities.Categories;
import kodlamaioWebsite.entities.Courses;
import kodlamaioWebsite.entities.Instructors;
import kodlamaioWebsite.logging.Logger;

public class WebManager {
	private WebDao webDao;
	private Logger loggers;
	private Categories categories;
	private Courses courses;
	private Instructors instructor;

	public WebManager(WebDao webDao, Logger logger, Categories categories, Courses courses, Instructors instructor) {
		super();
		this.webDao = webDao;
		this.loggers = logger;
		this.categories = categories;
		this.courses = courses;
		this.instructor = instructor;
	}

	public void addName() {
		webDao.addCategory(categories);
		webDao.addCourse(courses);
	}

}
