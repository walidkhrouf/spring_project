package tn.esprit.walidkhrouf.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.walidkhrouf.Entities.Instructor;

import tn.esprit.walidkhrouf.Repositories.IInstructorRepository;

import java.util.List;

@Service
public class InstructorServicesImpl {
    @Autowired
    private IInstructorRepository instructorRepository;

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

}
