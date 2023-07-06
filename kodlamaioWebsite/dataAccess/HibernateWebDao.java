package kodlamaioWebsite.dataAccess;

import kodlamaioWebsite.entities.Categories;
import kodlamaioWebsite.entities.Courses;
import kodlamaioWebsite.entities.Instructors;

public class HibernateWebDao implements WebDao {

	@Override
	public void addCourse(Courses course) {
		System.out.println(course.getName() + "added to db with Hibernate.");

	}

	public void addCategory(Categories category) {
		System.out.println(category.getName() + "added to db with Hibernate.");
	}

	@Override
	public void addInstructor(Instructors instructor) {
		System.out.println(instructor.getName() + "added to db with Hibernate.");

	}

}
