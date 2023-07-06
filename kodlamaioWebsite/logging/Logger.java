package kodlamaioWebsite.logging;

import kodlamaioWebsite.entities.Categories;
import kodlamaioWebsite.entities.Courses;
import kodlamaioWebsite.entities.Instructors;

public interface Logger {
	void CategoryLogger(Categories category);

	void CourseLogger(Courses course);

	void InstructorLogger(Instructors instructor);
}
