package ie.atu.registrationSignIn.controller;

import ie.atu.registrationSignIn.module.Registration;
import ie.atu.registrationSignIn.repository.RegistrationRepo;
import ie.atu.registrationSignIn.service.RegistrationService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SingIn")
public class RegistrationController {
    private final RegistrationService registrationService;
    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }
    //adding user for the first time
    @PostMapping("/Registration{user}")
    public ResponseEntity<Registration> addUser(@Valid @RequestBody Registration registration) {
        Registration saved = registrationService.addUser(registration);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
    //get all users
    //get user by email
    //get user by student number
}
