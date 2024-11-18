package tn.esprit.walidkhrouf.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.walidkhrouf.Entities.Course;

import tn.esprit.walidkhrouf.Repositories.ICourseRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class CourseServicesImpl {

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
