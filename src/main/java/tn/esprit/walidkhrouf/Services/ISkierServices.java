package tn.esprit.walidkhrouf.Services;

import tn.esprit.walidkhrouf.Entities.*;
import tn.esprit.walidkhrouf.Entities.Skier;
import java.util.List;
import java.time.LocalDate;
public interface ISkierServices {
    Skier addSkier(Skier skier);
    Skier updateSkier(Skier skier);
    Skier retriveSkier(Long numSkier);
    List<Skier> retriveAll();
    void removeSkier(Long numSkier);
    void assignSkierToPiste(Long numSkier, int numPiste);
    Skier getSkierByName(String name);
    List<Skier> getSkiersByBirthDate(LocalDate birthDate);
    Skier addSkierToPiste(String name,String lastnam, Color color);
    Skier addSkierAndAssignToCourse(Skier skier, int numCourse);
    List<Skier> retrieveSkiersBySubscriptionType(TypeSubscription typeSubscription);
    List<Skier> getSkiersByTypeCourse (TypeCourse typeCourse);
    void getSkierNotif();

}
