package ru.eltech.stud.kaignatev.stodo.service;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.eltech.stud.kaignatev.stodo.entity.ERole;
import ru.eltech.stud.kaignatev.stodo.entity.User;
import ru.eltech.stud.kaignatev.stodo.exception.UserExistException;
import ru.eltech.stud.kaignatev.stodo.payload.request.SignUpRequest;
import ru.eltech.stud.kaignatev.stodo.repository.UserRepository;

@Service
@Data
public class UserService {
    public static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private final BCryptPasswordEncoder passwordEncoder;

    public User createUser(SignUpRequest signUpRequest) {
        User user = new User();
        user.setEmail(signUpRequest.getEmail());
        user.setPassword(passwordEncoder.encode(signUpRequest.getPassword()));
        user.getRoles().add(ERole.ROLE_USER);

        try {
            LOG.info("Saving user {}", signUpRequest.getEmail());
            return userRepository.save(user);
        } catch (Exception e) {
            LOG.error("Error during registration. {}", e.getMessage());
            throw new UserExistException("The user "
                    + user.getUsername()
                    + " already exist. Please check credetionals");
        }
    }
}
