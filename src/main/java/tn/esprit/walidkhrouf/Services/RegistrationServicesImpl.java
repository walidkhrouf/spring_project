package tn.esprit.walidkhrouf.Services;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.walidkhrouf.Entities.Course;
import tn.esprit.walidkhrouf.Entities.Registration;

import tn.esprit.walidkhrouf.Entities.Skier;
import tn.esprit.walidkhrouf.Repositories.ICourseRepository;
import tn.esprit.walidkhrouf.Repositories.IRegistrationRepository;
import tn.esprit.walidkhrouf.Repositories.ISkierRepository;

import java.util.List;
@AllArgsConstructor


@Service
public class RegistrationServicesImpl {

    private IRegistrationRepository registrationRepository;
    private ISkierRepository skierRepository;
    private ICourseRepository courseRepository;

    public Registration addRegistration(Registration registration)
    {
        return registrationRepository.save(registration);
    }

    public Registration updateRegistration(Registration registration)
    {
        return registrationRepository.save(registration);
    }

    public Registration retriveRegistration(int numRegistration)
    {
        return registrationRepository.findById(numRegistration).orElse(null);
    }

    public List<Registration> retriveAll() {
        return (List<Registration>)registrationRepository.findAll();
    }

    public void removeRegistration(int numRegistration) {
        registrationRepository.deleteById(numRegistration);
    }

    public Registration addRegistrationToSkier(long numSkier, Registration registration) {
        Skier skier = skierRepository.findById(numSkier)
                .orElseThrow(() -> new RuntimeException("Skier not found"));

        registration.setSkier(skier);
        return registrationRepository.save(registration);
    }

    public Registration addRegistrationToCourse (Registration registration , int numCourse) {
        Course course = courseRepository.findById(numCourse).orElse(null);
        registration.setCourse(course);
        return registrationRepository.save(registration);
    }


}
