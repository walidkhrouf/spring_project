package tn.esprit.walidkhrouf.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.walidkhrouf.Entities.Course;

import tn.esprit.walidkhrouf.Repositories.ICourseRepository;

import java.util.List;

@Service
public class CourseServicesImpl {
    @Autowired
    private ICourseRepository courseRepository;

    public Course addCourse(Course course)
    {
        return courseRepository.save(course);
    }



    public Course updateCourse(Course course)
    {
        return courseRepository.save(course);
    }

    public Course retriveCourse(int numCourse)
    {
        return courseRepository.findById(numCourse).orElse(null);
    }

    public List<Course> retriveAll() {
        return (List<Course>)courseRepository.findAll();
    }

    public void removeCourse(int numCourse) {
        courseRepository.deleteById(numCourse);
    }

}
