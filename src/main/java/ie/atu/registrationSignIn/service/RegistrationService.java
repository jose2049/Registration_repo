package ie.atu.registrationSignIn.service;

import ie.atu.registrationSignIn.module.Registration;
import ie.atu.registrationSignIn.repository.RegistrationRepo;

import java.util.List;

public class RegistrationService {
    private List<Registration> reservations;

    private final RegistrationRepo registrationRepo;

    public RegistrationService(RegistrationRepo registrationRepo) {
        this.registrationRepo = registrationRepo;
    }
}
