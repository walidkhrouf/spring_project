package tn.esprit.walidkhrouf.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.walidkhrouf.Entities.Instructor;

public interface IInstructorRepository  extends CrudRepository<Instructor,Integer> {
}
