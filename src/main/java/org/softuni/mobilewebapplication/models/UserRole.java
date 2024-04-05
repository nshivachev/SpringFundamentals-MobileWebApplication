package org.softuni.mobilewebapplication.models;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class UserRole extends BaseEntity {
    @Basic
    private String name;
}
