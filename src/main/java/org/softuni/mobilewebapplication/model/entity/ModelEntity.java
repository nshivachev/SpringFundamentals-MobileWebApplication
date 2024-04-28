package org.softuni.mobilewebapplication.model.entity;

import jakarta.persistence.*;
import org.softuni.mobilewebapplication.model.enums.ModelCategoryEnum;

import java.time.LocalDateTime;

@Entity
@Table(name = "models")
public class ModelEntity extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private ModelCategoryEnum category;

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

    public ModelCategoryEnum getCategory() {
        return category;
    }

    public void setCategory(ModelCategoryEnum category) {
        this.category = category;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public BrandEntity getBrand() {
        return brand;
    }

    public void setBrand(BrandEntity brand) {
        this.brand = brand;
    }
}
