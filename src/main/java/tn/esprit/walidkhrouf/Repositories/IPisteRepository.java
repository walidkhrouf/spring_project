package tn.esprit.walidkhrouf.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.walidkhrouf.Entities.Piste;
import tn.esprit.walidkhrouf.Entities.Color;
import java.util.List;

public interface IPisteRepository  extends CrudRepository<Piste,Integer> {
    List<Piste> findByColor(Color color);
}
