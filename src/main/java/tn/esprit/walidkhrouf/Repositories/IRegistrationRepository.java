package tn.esprit.walidkhrouf.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.walidkhrouf.Entities.Registration;

public interface IRegistrationRepository  extends CrudRepository<Registration,Integer> {
}
