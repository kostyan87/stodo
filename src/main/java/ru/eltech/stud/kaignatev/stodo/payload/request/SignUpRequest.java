package ru.eltech.stud.kaignatev.stodo.payload.request;

import lombok.Data;
import ru.eltech.stud.kaignatev.stodo.annotations.PasswordMatches;
import ru.eltech.stud.kaignatev.stodo.annotations.ValidEmail;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@PasswordMatches
public class SignUpRequest {
    @Email(message = "It should have email format")
    @NotBlank(message = "User email is required")
    @ValidEmail
    private String email;
    @NotEmpty(message = "Password is required")
    @Size(min = 6)
    private String password;
    private String confirmPassword;
}
