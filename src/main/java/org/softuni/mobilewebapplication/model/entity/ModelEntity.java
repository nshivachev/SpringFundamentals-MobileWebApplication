package org.softuni.mobilewebapplication.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "model")
public class ModelEntity extends BaseEntity {

    @Basic
    private Integer category;

    @Basic
    private LocalDateTime created;

    @Column(name = "end_year")
    private Integer endYear;

    @Basic
    private LocalDateTime modified;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(name = "start_year")
    private Integer startYear;

    @ManyToOne
    private BrandEntity brand;
}
