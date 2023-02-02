package ru.eltech.stud.kaignatev.stodo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.eltech.stud.kaignatev.stodo.dto.UserDto;
import ru.eltech.stud.kaignatev.stodo.entity.User;
import ru.eltech.stud.kaignatev.stodo.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserDto getUserData(Long id) {
        // TODO: Определить логику, если не найден

        User user = userRepository.findById(id).get();

        return UserDto
                .builder()
                .email(user.getEmail())
                .terms(user.getTerms())
                .build();
    }

    public UserDto updateUser(Long id) {
        return null;
    }
}
