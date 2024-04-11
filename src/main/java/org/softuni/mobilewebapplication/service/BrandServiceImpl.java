package org.softuni.mobilewebapplication.service;

import org.softuni.mobilewebapplication.model.dto.BrandDTO;
import org.softuni.mobilewebapplication.repository.ModelRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BrandServiceImpl implements BrandService {

    private final ModelRepository modelRepository;

    public BrandServiceImpl(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @Override
    public List<BrandDTO> getAllBrands() {
        //TODO: better implementation, sorting by brand name
        Map<String, BrandDTO> brands = new HashMap<>();

//        for (ModelEntity model : this.modelRepository.findAll()) {
//            String brandName = model.getBrand().getName();
//
//            brands.putIfAbsent(brandName, new BrandDTO(brandName, new ArrayList<>()));
//
//            brands.get(brandName).models().add(new ModelDTO(model.getId(), model.getName()));
//        }

        return brands.values().stream().toList();
    }
}
