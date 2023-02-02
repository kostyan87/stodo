package ru.eltech.stud.kaignatev.stodo.dto;

import lombok.Builder;
import lombok.Data;
import ru.eltech.stud.kaignatev.stodo.entity.Term;

import java.util.List;

@Builder
@Data
public class UserDto {
    private String email;

    private List<Term> terms;
}
