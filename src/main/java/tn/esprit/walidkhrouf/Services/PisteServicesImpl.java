package tn.esprit.walidkhrouf.Services;


import tn.esprit.walidkhrouf.Entities.Piste;
import tn.esprit.walidkhrouf.Repositories.IPisteRepository;

public class PisteServicesImpl {

    private IPisteRepository pisteRepository;

    public Piste addPiste(Piste piste)
    {
        return pisteRepository.save(piste);
    }

}
