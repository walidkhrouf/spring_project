package tn.esprit.walidkhrouf.Services;


import tn.esprit.walidkhrouf.Entities.Registration;
import tn.esprit.walidkhrouf.Repositories.IRegistrationRepository;

public class RegistrationServicesImpl {

    private IRegistrationRepository registrationRepository;

    public Registration addRegistration(Registration registration)
    {
        return registrationRepository.save(registration);
    }

}
