package org.softuni.mobilewebapplication.web;

import org.softuni.mobilewebapplication.model.dto.CreateOfferDTO;
import org.softuni.mobilewebapplication.service.OfferService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping("/offers")
public class OfferController {

    public final OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping("/all")
    public String all() {
        return "offers";
    }

    @GetMapping("/add")
    public String add() {
        return "offer-add";
    }

    @PostMapping
    public String add(CreateOfferDTO createOfferDTO) {
        offerService.createOffer(createOfferDTO);

        return "index";
    }

    @GetMapping("/{uuid}/details")
    public String details(@PathVariable("uuid") UUID uuid) {
        return "details";
    }
}
