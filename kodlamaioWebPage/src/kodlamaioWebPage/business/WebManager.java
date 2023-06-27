package kodlamaioWebPage.business;

import kodlamaioWebPage.core.logging.Logger;
import kodlamaioWebPage.dataAccess.WebDao;
import kodlamaioWebPage.entities.Categories;
import kodlamaioWebPage.entities.Courses;
import kodlamaioWebPage.entities.Instructor;

public class WebManager {
	private WebDao webDao;
	private Logger[] loggers;
	private Categories[] categories;
	private Courses[] courses;
	private Instructor instructor;

	public WebManager(WebDao webDao, Logger[] logger, Categories[] categories, Courses[] courses,
			Instructor instructor) {
		super();
		this.webDao = webDao;
		this.loggers = logger;
		this.categories = categories;
		this.courses = courses;
		this.instructor = instructor;
	}
	

	public void checkCourse(Courses[] courses) throws Exception {
		for (Courses courses2 : courses) {
			if (courses2.getPrice() < 0) {
				throw new Exception("kurs fiyatı 0'dan küçük olamaz.");
			}
		}
	}

	public void addCategory(Categories category) throws Exception {
		for (Categories categories2 : categories) {
			if (categories2.getCategories() == category.getCategories()) {
				throw new Exception("bu kategori zaten var.");
			}

		}

	}

	public void addInstructor(Instructor instructor) {
		System.out.println("eğitmen eklendi:" + instructor);
	}

	public void addCourse(Courses course) throws Exception {
		for (Courses course2 : courses) {
			if (course2.getCourses() == course.getCourses()) {
				throw new Exception("bu kurs zaten var.");
			}

		}

	}for(

	Logger loggerCourses:loggers)
	{
		loggerCourses.log(course.getName());
	}for(
	Logger loggerInstructor:loggers)
	{
		loggerInstructor.log(instructor.getInstructor());
	}for(
	Logger loggerCategories:loggers)
	{
		loggerCategories.log(categories);
	}
}
