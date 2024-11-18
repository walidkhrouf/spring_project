package tn.esprit.walidkhrouf.Services;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.walidkhrouf.Entities.Piste;

import tn.esprit.walidkhrouf.Repositories.IPisteRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class PisteServicesImpl {

    private IPisteRepository pisteRepository;

    public Piste addPiste(Piste piste)

    {
        return pisteRepository.save(piste);
    }

    public Piste updatePiste(Piste piste)
    {
        return pisteRepository.save(piste);
    }

    public Piste retrivePiste(int numPiste)
    {
        return pisteRepository.findById(numPiste).orElse(null);
    }

    public List<Piste> retriveAll() {
        return (List<Piste>)pisteRepository.findAll();
    }

    public void removePiste(int numPiste) {
        pisteRepository.deleteById(numPiste);
    }

}
