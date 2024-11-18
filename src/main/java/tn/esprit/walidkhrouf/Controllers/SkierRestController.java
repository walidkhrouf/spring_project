package tn.esprit.walidkhrouf.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.walidkhrouf.Entities.*;
import tn.esprit.walidkhrouf.Entities.Skier;
import tn.esprit.walidkhrouf.Services.ISkierServices;
import tn.esprit.walidkhrouf.Services.SkierServicesImpl;
import java.time.LocalDate;
import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("skier")
public class SkierRestController {

    private final ISkierServices skierServices;
    @PostMapping("/add")
    public Skier saveSkier(@RequestBody Skier skier)
    {
        return skierServices.addSkier(skier);

    }
    @GetMapping("/get/{numSkier}")
    public Skier getSkier (@PathVariable Long numSkier)
    {
        return skierServices.retriveSkier(numSkier);
    }
    @PutMapping("/update/{numSkier}")
    public Skier updateSkier(@RequestBody Skier skier)
    {
        return skierServices.updateSkier(skier);

    }
    @DeleteMapping("/delete/{numSkier}")
    public void deleteSkier(@PathVariable long numSkier) {
        skierServices.removeSkier(numSkier);
    }
    @PutMapping("/assign/{numSkier}/{numPiste}")
    public void assignSkierToPiste(@PathVariable Long numSkier, @PathVariable int numPiste) {
        skierServices.assignSkierToPiste(numSkier, numPiste);
    }

    @GetMapping("/getByName/{name}")
    public Skier getSkierByName(@PathVariable String name) {
        return skierServices.getSkierByName(name);
    }

    @GetMapping("/getByBirthDate/{birthDate}")
    public List<Skier> getSkiersByBirthDate(@PathVariable String birthDate) {
        LocalDate date = LocalDate.parse(birthDate);
        return skierServices.getSkiersByBirthDate(date);
    }
    @PostMapping("/addToPiste/{color}/{name}/{lastname}")
    public Skier addToPiste(@PathVariable Color color,@PathVariable String name ,@PathVariable String lastname) {
        return skierServices.addSkierToPiste(name, lastname, color);
    }

    @PostMapping("/addSkierAndAssignToCourse/{numCourse}")
    public Skier addSkierAndAssignToCourse(@RequestBody Skier skier, @PathVariable int numCourse) {
        return skierServices.addSkierAndAssignToCourse(skier, numCourse);
    }

    @GetMapping("/getSkiersBySubscription/{typeSubscription}")
    public List<Skier> retrieveSkiersBySubscriptionType(@PathVariable TypeSubscription typeSubscription) {
        return skierServices.retrieveSkiersBySubscriptionType(typeSubscription);
    }
}
