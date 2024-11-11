package tn.esprit.walidkhrouf.Services;

import tn.esprit.walidkhrouf.Entities.Instructor;


import java.util.List;

public interface IInstructorServices {

    Instructor addInstructor(Instructor instructor);
    Instructor updateInstructor(Instructor instructor);
    Instructor retriveInstructor(int numInstructor);
    List<Instructor> retriveAll();
    void removeInstructor(int numInstructor);

}
