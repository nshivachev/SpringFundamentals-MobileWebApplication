package org.softuni.mobilewebapplication.service;

import org.softuni.mobilewebapplication.model.dto.CreateOfferDTO;

import java.util.UUID;

public interface OfferService {

    UUID createOffer(CreateOfferDTO createOfferDTO);
}
