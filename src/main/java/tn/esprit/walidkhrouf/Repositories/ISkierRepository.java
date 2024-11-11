package tn.esprit.walidkhrouf.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.walidkhrouf.Entities.Skier;
import java.util.List;
import java.time.LocalDate;



public interface ISkierRepository  extends CrudRepository<Skier,Long> {
    Skier findByName(String name);
    Skier findByLastname(String lastname);
    Skier findByNameAndLastname(String name, String lastname);
    List<Skier> findByBirthDate(LocalDate birthDate);
}
