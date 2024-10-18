package tn.esprit.walidkhrouf.Services;

import tn.esprit.walidkhrouf.Entities.Course;
import tn.esprit.walidkhrouf.Repositories.ICourseRepository;


public class CourseServicesImpl {

    private ICourseRepository courseRepository;

    public Course addCourse(Course course)
    {
        return courseRepository.save(course);
    }

}
