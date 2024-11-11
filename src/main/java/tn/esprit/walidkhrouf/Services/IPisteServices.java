package tn.esprit.walidkhrouf.Services;

import tn.esprit.walidkhrouf.Entities.Piste;


import java.util.List;

public interface IPisteServices {
    Piste addPiste(Piste piste);
    Piste updatePiste(Piste piste);
    Piste retrivePiste(Long numPiste);
    List<Piste> retriveAll();
    void removePiste(Long numPiste);
}
