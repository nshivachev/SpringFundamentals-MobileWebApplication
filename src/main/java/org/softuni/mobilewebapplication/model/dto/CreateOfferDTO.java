package org.softuni.mobilewebapplication.model.dto;

import org.softuni.mobilewebapplication.model.entity.ModelEntity;
import org.softuni.mobilewebapplication.model.enums.EngineEnum;
import org.softuni.mobilewebapplication.model.enums.TransmissionEnum;

import java.math.BigDecimal;

public record CreateOfferDTO(ModelEntity model,
                             BigDecimal price,
                             EngineEnum engine,
                             TransmissionEnum transmission,
                             Integer year,
                             Integer mileage,
                             String description,
                             String imageUrl) {
}
