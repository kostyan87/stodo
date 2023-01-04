package ru.eltech.stud.kaignatev.stodo.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Term {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,
            mappedBy = "term", orphanRemoval = true)
    private List<Subject> subjects;
}
