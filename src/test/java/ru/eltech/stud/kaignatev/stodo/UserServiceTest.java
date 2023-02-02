package ru.eltech.stud.kaignatev.stodo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.eltech.stud.kaignatev.stodo.service.UserService;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    void getUserTest() {

    }
}
