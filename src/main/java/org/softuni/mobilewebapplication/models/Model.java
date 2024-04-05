package org.softuni.mobilewebapplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "models")
public class Model extends BaseEntity {
    @Basic
    private Integer category;

    @Basic
    private LocalDateTime created;

    @Column(name = "end_year")
    private Integer endYear;

    @Basic
    private LocalDateTime modified;

    @Column(nullable = false)
    private String name;

    @Column(name = "start_year")
    private Integer startYear;

    @ManyToOne
    private Brand brand;
}
