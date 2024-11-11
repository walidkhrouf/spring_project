package tn.esprit.walidkhrouf.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.walidkhrouf.Entities.Color;
import tn.esprit.walidkhrouf.Entities.Skier;
import tn.esprit.walidkhrouf.Entities.Piste;
import tn.esprit.walidkhrouf.Repositories.IPisteRepository;
import tn.esprit.walidkhrouf.Repositories.ISkierRepository;
import java.util.List;
import java.time.LocalDate;
import java.util.Set;
import java.util.HashSet;

@RequiredArgsConstructor
@Service
public class SkierServicesImpl implements ISkierServices{
    private final ISkierRepository skierRepository;
    private final IPisteRepository pisteRepository;




    public Skier addSkier(Skier skier)

   {
     return skierRepository.save(skier);
   }

    public Skier updateSkier(Skier skier)
    {
        return skierRepository.save(skier);
    }

    public Skier retriveSkier(Long numSkier)
    {
        return skierRepository.findById(numSkier).orElse(null);
    }

    public List<Skier> retriveAll() {
    return (List<Skier>)skierRepository.findAll();
    }

    public void removeSkier(Long numSkier) {
    skierRepository.deleteById(numSkier);
    }


   public void assignSkierToPiste(Long numSkier, int numPiste)
    {
        Skier skier = skierRepository.findById(numSkier).orElse(null);
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        piste.getSkiers().add(skier);
        skier.getPistes().add(piste);
        pisteRepository.save(piste);
        skierRepository.save(skier);
    }


    public Skier getSkierByName(String name) {
        return skierRepository.findByName(name);
    }

    public List<Skier> getSkiersByBirthDate(LocalDate birthDate) {
        return skierRepository.findByBirthDate(birthDate);
    }

    public Skier addSkierToPiste(String name, String lastname, Color color) {

        Skier skier = skierRepository.findByNameAndLastname(name, lastname);

        List<Piste> pistes = pisteRepository.findByColor(color);
        for (Piste p:pistes){
            p.getSkiers().add(skier);
            pisteRepository.save(p);
        }

        return skierRepository.save(skier);
    }
}
