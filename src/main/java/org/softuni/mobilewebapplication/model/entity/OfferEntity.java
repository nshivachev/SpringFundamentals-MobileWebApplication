package org.softuni.mobilewebapplication.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "offers")
public class OfferEntity extends BaseEntity {
    @Basic
    private LocalDateTime created;

    @Column(columnDefinition = "text")
    private String description;

    @Basic
    private Integer engine;

    @Column(name = "image_url")
    private String imageUrl;

    @Basic
    private Integer mileage;

    @Basic
    private LocalDateTime modified;

    @Basic
    private BigDecimal price;

    @Basic
    private Integer transmission;

    @Basic
    private Integer year;

    @ManyToOne
    private ModelEntity model;

    @ManyToOne
    private UserEntity seller;
}
