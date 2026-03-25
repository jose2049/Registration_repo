package ie.atu.registrationSignIn.service;

import ie.atu.registrationSignIn.module.Registration;
import ie.atu.registrationSignIn.repository.RegistrationRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RegistrationService {
    private List<Registration> users;

    private final RegistrationRepo registrationRepository;

    public RegistrationService(RegistrationRepo registrationRepository) {
        this.registrationRepository = registrationRepository;
    }
    //Returning a created user
    public Registration addUser(Registration user){

        return user;
    }
    //get all users
    //get user by email
    //get user by student number
}
