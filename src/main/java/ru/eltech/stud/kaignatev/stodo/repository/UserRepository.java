package ru.eltech.stud.kaignatev.stodo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.eltech.stud.kaignatev.stodo.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
}
