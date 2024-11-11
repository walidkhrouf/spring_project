package tn.esprit.walidkhrouf.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.walidkhrouf.Entities.Registration;

import tn.esprit.walidkhrouf.Entities.Skier;
import tn.esprit.walidkhrouf.Services.RegistrationServicesImpl;


@RequiredArgsConstructor
@RestController
@RequestMapping("registration")
public class RegistrationRestController {

    private final RegistrationServicesImpl registrationServices;
    @PostMapping("/add")
    public Registration saveRegistration(@RequestBody Registration registration)
    {
        return registrationServices.addRegistration(registration);

    }
    @GetMapping("/get/{numRegistration}")
    public Registration getRegistration (@PathVariable int numRegistration)
    {
        return registrationServices.retriveRegistration(numRegistration);
    }

    @PutMapping("/update/{numRegistration}")
    public Registration updateRegistration(@RequestBody Registration registration)
    {
        return registrationServices.updateRegistration(registration);

    }
    @DeleteMapping("/delete/{numRegistration}")
    public void deleteRegistration(@PathVariable int numRegistration) {
        registrationServices.removeRegistration(numRegistration);
    }


    @PostMapping("/addToSkier/{numSkier}")
    public Registration addRegistrationToSkier(@PathVariable long numSkier, @RequestBody Registration registration) {
        return registrationServices.addRegistrationToSkier(numSkier, registration);
    }

    @PostMapping("/addToCourse/{numCourse}")
    public Registration addRegistrationToSkier(@PathVariable int numCourse , @RequestBody Registration registration) {
        return registrationServices.addRegistrationToCourse(registration, numCourse);
    }



}
