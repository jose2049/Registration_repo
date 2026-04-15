package ie.atu.registrationSignIn.service;

import ie.atu.registrationSignIn.module.Registration;
import ie.atu.registrationSignIn.repository.RegistrationRepo;
import jakarta.validation.constraints.NotBlank;
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
        //everything stored in users
        users = registrationRepository.findAll();

        //check for time conflicts
        for(Registration existingUser: users){
            //Same email
            if(existingUser.getEmail().equals(user.getEmail())){
                throw new RuntimeException("User with email already exists");
            }
        }
        //Add info in the database
        registrationRepository.save(user);
        return user;
    }
    //get all users
    public List<Registration> getAllUsers() {
        return registrationRepository.findAll();
    }
    //get user by email
    public List<Registration> getUserByEmail(String email) {
        return registrationRepository.findByEmail(email);
    }
    //get user by student number
    public List<Registration> getUserByStudentNumber(String studentNumber) {
        return registrationRepository.findByStudentNumber(studentNumber);
    }
}
