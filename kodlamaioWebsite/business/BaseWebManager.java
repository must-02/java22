package kodlamaioWebsite.business;

import kodlamaioWebsite.dataAccess.WebDao;
import kodlamaioWebsite.entities.Categories;
import kodlamaioWebsite.entities.Courses;
import kodlamaioWebsite.entities.Instructors;
import kodlamaioWebsite.logging.Logger;

public class BaseWebManager {
	private WebDao webDao;
	private Logger[] loggers;
	public Courses[] courses;
	public Categories[] categories;

	public BaseWebManager(WebDao webDao, Logger[] logger) {

		this.webDao = webDao;
		this.loggers = logger;

	}

	public void addCourse(Courses course) throws Exception {
		for (Courses course_ : courses) {
			if (course.getName() == course_.getName()) {
				throw new Exception("this course already exists");
			}
		}
		webDao.addCourse(course);
		for (Logger logger_ : loggers) {
			logger_.CourseLogger(course);
		}
	}

	public void addCategory(Categories category) throws Exception {
		for (Categories category_ : categories) {
			if (category.getName() == category_.getName()) {
				throw new Exception("this course already exists");
			}
		}
		webDao.addCategory(category);
		for (Logger logger_ : loggers) {
			logger_.CategoryLogger(category);
		}
	}

	public void addInstructor(Instructors instructor) {
		webDao.addInstructor(instructor);
		for (Logger logger_ : loggers) {
			logger_.InstructorLogger(instructor);
		}
	}

}
