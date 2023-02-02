package ru.eltech.stud.kaignatev.stodo.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@Builder
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(length = 3000, nullable = false)
    private String password;

//    @ElementCollection(targetClass = ERole.class)
//    @CollectionTable(name = "user_role",
//    joinColumns = @JoinColumn(referencedColumnName = "id"))
//    private Set<ERole> role;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private List<Term> terms;
}
