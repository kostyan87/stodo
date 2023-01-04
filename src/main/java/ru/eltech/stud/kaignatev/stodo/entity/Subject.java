package ru.eltech.stud.kaignatev.stodo.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private Long title;

    @ManyToOne(fetch = FetchType.LAZY)
    private Term term;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,
            mappedBy = "subject", orphanRemoval = true)
    private List<Task> tasks;
}
