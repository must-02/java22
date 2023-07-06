package kodlamaioWebsite.dataAccess;

import kodlamaioWebsite.entities.Categories;
import kodlamaioWebsite.entities.Courses;
import kodlamaioWebsite.entities.Instructors;

public interface WebDao {
	void addCourse(Courses course);

	void addInstructor(Instructors instructor);

	void addCategory(Categories category);
}
