package ie.atu.registrationSignIn.repository;

import ie.atu.registrationSignIn.module.Registration;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistrationRepo extends JpaRepository<Registration, String>
{
    //I don't know what this bit of code does
    List<Registration> findByEmail(String email);
    List<Registration> findByStudentNumber(String studentNumber);
}
