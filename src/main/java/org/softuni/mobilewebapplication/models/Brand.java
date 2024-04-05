package org.softuni.mobilewebapplication.models;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "brands")
public class Brand extends BaseEntity {
    @Basic
    private LocalDateTime created;

    @Basic
    private LocalDateTime modified;

    @Column(nullable = false)
    private String name;
}
