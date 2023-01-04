package ru.eltech.stud.kaignatev.stodo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    private Subject subject;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private LocalDate deadlineDate;

    private Boolean isCompleted;
}
