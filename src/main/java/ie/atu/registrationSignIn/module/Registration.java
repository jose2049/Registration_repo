package ie.atu.registrationSignIn.module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Email(message = "Please enter a valid email address")
    private String email;

    @NotBlank(message = "Please enter a password")
    @Min(value = 8, message = "Password must be minimum 8 character long")
    private String password;

    @Min(value = 8, message = "Password must be minimum 8 character long")
    @NotBlank(message = "Please confirm password")
    private String confirmPassword;

    @NotBlank(message = "Please enter your name")
    private  String firstName;

    @NotBlank(message = "Please enter your last name")
    private String lastName;

    @NotBlank(message = "Please enter your student number")
    private String studentNumber;

    @NotBlank(message = "Please enter your current address")
    private String address;

    @NotBlank(message = "Please enter your ATU campus")
    private String campus;
}
