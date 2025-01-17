package org.softuni.mobilewebapplication.repository;

import org.softuni.mobilewebapplication.model.entity.ModelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelRepository extends JpaRepository<ModelEntity, Long> {
    List<ModelEntity> findAllByBrandId(Long id);
}
