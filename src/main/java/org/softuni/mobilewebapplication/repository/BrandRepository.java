package org.softuni.mobilewebapplication.repository;

import org.softuni.mobilewebapplication.model.entity.BrandEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandRepository extends JpaRepository<BrandEntity, Long> {

    //    @Query("select b from BrandEntity b join fetch b.models")
    @EntityGraph(value = "brandWithModels", attributePaths = "models")
    @Query("select b from BrandEntity b")
    List<BrandEntity> getAllBrands();
}
