package tn.esprit.walidkhrouf.Services;


import tn.esprit.walidkhrouf.Entities.Instructor;
import tn.esprit.walidkhrouf.Repositories.IInstructorRepository;

public class InstructorServicesImpl {

    private IInstructorRepository instructorRepository;

    public Instructor addInstructor(Instructor instructor)
    {
        return instructorRepository.save(instructor);
    }

}
