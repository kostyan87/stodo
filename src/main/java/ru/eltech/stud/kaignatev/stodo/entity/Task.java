package ru.eltech.stud.kaignatev.stodo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    private Subject subject;

    @Column(nullable = false)
    @JsonFormat(pattern = "yyyy-mm-dd")
    private LocalDate deadlineDate;

    @Column(nullable = false)
    private Boolean isCompleted;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @PrePersist
    private void onCreate() {
        this.createdAt = LocalDateTime.now();
    }
}
