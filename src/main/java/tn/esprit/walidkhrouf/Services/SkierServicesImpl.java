package tn.esprit.walidkhrouf.Services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.walidkhrouf.Entities.Color;
import tn.esprit.walidkhrouf.Entities.Skier;
import tn.esprit.walidkhrouf.Entities.*;
import tn.esprit.walidkhrouf.Entities.Piste;
import tn.esprit.walidkhrouf.Repositories.*;

import java.util.List;
import java.time.LocalDate;
import java.util.Set;
import java.util.HashSet;
import java.util.logging.Logger;
@Slf4j
@RequiredArgsConstructor
@Service
public class SkierServicesImpl implements ISkierServices{
    private final ISkierRepository skierRepository;
    private final IPisteRepository pisteRepository;
    private final ICourseRepository courseRepository;
    private final ISubscriptionRepository subscriptionRepository;
    private final IRegistrationRepository registrationRepository;



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

    @Transactional
    public Skier addSkierAndAssignToCourse(Skier skier, int numCourse) {

        Course course = courseRepository.findById(numCourse)
                .orElse(null);
        for (Registration registration:skier.getRegistrations())
        {
           registration.setCourse(course);
           registration.setSkier(skier);
           registrationRepository.save(registration);
        }

        return skierRepository.save(skier);
    }

    public List<Skier> retrieveSkiersBySubscriptionType(TypeSubscription typeSubscription) {
        return skierRepository.getSkiersByTypeSubscription(typeSubscription);
    }
    public List<Skier> getSkiersByTypeCourse (TypeCourse typeCourse) {
        return skierRepository.getSkiersByTypeCourse(typeCourse);
    }
    @Scheduled(cron = "*/15 * * * * *")
    public void getSkierNotif() {
        log.info("bonjour");
        log.debug("in method: getSkierNotif");
        log.error("this is an error");
        log.warn("this is a worning");
    }



   //@Scheduled(cron = "*/15 * * * * *")
  //  public void getSkierN() {
        //log.info("Fetching skiers...");

       // List<Skier> skiers = skierRepository.findAll();

      //  skiers.forEach(skier -> log.info("Skier Name: {}", skier.getName()));

       // log.info("Total skiers logged: {}", skiers.size());
   // }


}
