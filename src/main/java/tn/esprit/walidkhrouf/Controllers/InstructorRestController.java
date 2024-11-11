package tn.esprit.walidkhrouf.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.walidkhrouf.Entities.Instructor;
import tn.esprit.walidkhrouf.Entities.Skier;
import tn.esprit.walidkhrouf.Services.InstructorServicesImpl;

@RequiredArgsConstructor
@RestController
@RequestMapping("instructor")
public class InstructorRestController {

    private final InstructorServicesImpl instructorServices;
    @PostMapping("/add")
    public Instructor saveInstructor(@RequestBody Instructor instructor)
    {
        return instructorServices.addInstructor(instructor);

    }
    @GetMapping("/get/{numInstructor}")
    public Instructor getInstructor (@PathVariable int numInstructor)
    {
        return instructorServices.retriveInstructor(numInstructor);
    }

    @PutMapping("/update/{numInstructor}")
    public Instructor updateInstructor(@RequestBody Instructor instructor)
    {
        return instructorServices.updateInstructor(instructor);

    }
    @DeleteMapping("/delete/{numInstructor}")
    public void deleteInstructor(@PathVariable int numInstructor) {
        instructorServices.removeInstructor(numInstructor);
    }

}
