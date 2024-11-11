package tn.esprit.walidkhrouf.Services;

import tn.esprit.walidkhrouf.Entities.Registration;


import java.util.List;

public interface IRegistrationServices {

    Registration addRegistration(Registration registration);
    Registration updateRegistration(Registration registration);
    Registration retriveRegistration(int numRegistration);
    List<Registration> retriveAll();
    void removeRegistration(int numRegistration);

    Registration addRegistrationToSkier(long numSkier, Registration registration);

    Registration addRegistrationToCours(Registration registration, int numCourse);

}
