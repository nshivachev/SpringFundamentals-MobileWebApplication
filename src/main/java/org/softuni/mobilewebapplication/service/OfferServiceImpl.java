package org.softuni.mobilewebapplication.service;

import org.softuni.mobilewebapplication.model.dto.CreateOfferDTO;
import org.softuni.mobilewebapplication.model.entity.ModelEntity;
import org.softuni.mobilewebapplication.model.entity.OfferEntity;
import org.softuni.mobilewebapplication.repository.ModelRepository;
import org.softuni.mobilewebapplication.repository.OfferRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OfferServiceImpl implements OfferService {

    private final OfferRepository offerRepository;
    private final ModelRepository modelRepository;

    public OfferServiceImpl(OfferRepository offerRepository, ModelRepository modelRepository) {
        this.offerRepository = offerRepository;
        this.modelRepository = modelRepository;
    }

    @Override
    public UUID createOffer(CreateOfferDTO createOfferDTO) {
        OfferEntity newOffer = map(createOfferDTO);
        ModelEntity model = modelRepository.findById(createOfferDTO.getModelId()).orElseThrow(IllegalArgumentException::new);
        newOffer.setModel(model);
        offerRepository.save(newOffer);
        return newOffer.getUuid();
    }

    private OfferEntity map(CreateOfferDTO createOfferDTO) {
        return new OfferEntity().setUuid(UUID.randomUUID())
                .setDescription(createOfferDTO.getDescription())
                .setEngine(createOfferDTO.getEngine())
                .setTransmission(createOfferDTO.getTransmission())
                .setImageUrl(createOfferDTO.getImageUrl())
                .setMileage(createOfferDTO.getMileage())
                .setPrice(createOfferDTO.getPrice())
                .setYear(createOfferDTO.getYear());
    }
}
