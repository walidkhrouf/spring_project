package tn.esprit.walidkhrouf.Services;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.walidkhrouf.Entities.Instructor;

import tn.esprit.walidkhrouf.Repositories.ICourseRepository;
import tn.esprit.walidkhrouf.Repositories.IInstructorRepository;
import tn.esprit.walidkhrouf.Entities.Course;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

@AllArgsConstructor
@Service
public class InstructorServicesImpl {

    private IInstructorRepository instructorRepository;
    private ICourseRepository courseRepository;

    public Instructor addInstructor(Instructor instructor)
    {
        return instructorRepository.save(instructor);
    }

    public Instructor updateInstructor(Instructor instructor)
    {
        return instructorRepository.save(instructor);
    }

    public Instructor retriveInstructor(int numInstructor)
    {
        return instructorRepository.findById(numInstructor).orElse(null);
    }

    public List<Instructor> retriveAll() {
        return (List<Instructor>)instructorRepository.findAll();
    }

    public void removeInstructor(int numInstructor) {
        instructorRepository.deleteById(numInstructor);
    }
    public Instructor addInstructorToCourse(Instructor ins, List<Integer> numCourse) {
        Set<Course> courses = new HashSet<>();
        courseRepository.findAllById(numCourse).forEach(courses::add);

        ins.setCourses(new HashSet<>());
        for (Course course : courses) {
            ins.getCourses().add(course);
        }


        return instructorRepository.save(ins);
    }

    public Instructor addInstructorToCourses(Instructor instructor) {
        Set<Course> courseSet = new HashSet<>();
        if(instructor.getCourses().isEmpty()){
            return instructorRepository.save(instructor);
        }
        for(Course c : instructor.getCourses()){
            Course course = courseRepository.findById(c.getNumCourse()).orElse(null);
            courseSet.add(course);
        }
        instructor.setCourses(courseSet);
        return instructorRepository.save(instructor);
    }

}
