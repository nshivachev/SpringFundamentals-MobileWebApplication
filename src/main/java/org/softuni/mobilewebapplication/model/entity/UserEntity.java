package org.softuni.mobilewebapplication.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {
    @Column(name = "is_active")
    private boolean isActive;

    @Basic
    private LocalDateTime created;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "last_name")
    private String lastName;

    @Basic
    private LocalDateTime modified;

    @Basic
    private String password;

    @Column(nullable = false)
    private String username;

    @ManyToMany
    private Set<UserRoleEntity> role;
}
