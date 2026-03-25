package ie.atu.registrationSignIn.repository;

import ie.atu.registrationSignIn.module.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepo extends JpaRepository<Registration, String>
{
    //I don't know what this bit of code does
}
