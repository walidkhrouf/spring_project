package tn.esprit.walidkhrouf.Services;

import tn.esprit.walidkhrouf.Entities.Course;


import java.util.List;

public interface ICourseServices {

    Course addCourse(Course course);
    Course updateCourse(Course course);
    Course retriveCourse(int numCourse);
    List<Course> retriveAll();
    void removeCourse(int numCourse);

}
