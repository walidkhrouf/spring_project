package tn.esprit.walidkhrouf.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.walidkhrouf.Entities.Course;
import tn.esprit.walidkhrouf.Entities.Skier;
import tn.esprit.walidkhrouf.Services.CourseServicesImpl;
import tn.esprit.walidkhrouf.Services.SkierServicesImpl;

@RequiredArgsConstructor
@RestController
@RequestMapping("course")
public class CourseRestController {

    private final CourseServicesImpl courseServices;
    @PostMapping("/add")
    public Course saveCourse(@RequestBody Course course)
    {
        return courseServices.addCourse(course);

    }
    @GetMapping("/get/{numCourse}")
    public Course getCourse (@PathVariable int numCourse)
    {
        return courseServices.retriveCourse(numCourse);
    }

    @PutMapping("/update/{numCourse}")
    public Course updateCourse(@RequestBody Course course)
    {
        return courseServices.updateCourse(course);

    }
    @DeleteMapping("/delete/{numCourse}")
    public void deleteCourse(@PathVariable int numCourse) {
        courseServices.removeCourse(numCourse);
    }
}
