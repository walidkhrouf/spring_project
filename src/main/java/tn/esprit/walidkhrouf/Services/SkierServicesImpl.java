package tn.esprit.walidkhrouf.Services;

import tn.esprit.walidkhrouf.Entities.Skier;
import tn.esprit.walidkhrouf.Repositories.ISkierRepository;

public class SkierServicesImpl {
private ISkierRepository skierRepository;

public Skier addSkier(Skier skier)
   {
     return skierRepository.save(skier);
   }
}
