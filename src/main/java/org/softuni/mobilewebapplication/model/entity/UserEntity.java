package org.softuni.mobilewebapplication.model.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

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

    @Column(nullable = false, unique = true)
    private String email;

    @ManyToOne
    private UserRoleEntity role;

    public UserEntity() {
    }

    public boolean isActive() {
        return isActive;
    }

    public UserEntity setActive(boolean active) {
        isActive = active;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public UserEntity setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public UserEntity setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserEntity setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public UserEntity setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserRoleEntity getRole() {
        return role;
    }

    public UserEntity setRole(UserRoleEntity role) {
        this.role = role;
        return this;
    }
}
