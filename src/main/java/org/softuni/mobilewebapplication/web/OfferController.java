package org.softuni.mobilewebapplication.web;

import jakarta.validation.Valid;
import org.softuni.mobilewebapplication.model.dto.CreateOfferDTO;
import org.softuni.mobilewebapplication.model.enums.TransmissionEnum;
import org.softuni.mobilewebapplication.service.BrandService;
import org.softuni.mobilewebapplication.service.OfferService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.UUID;

@Controller
@RequestMapping("/offer")
public class OfferController {

    public final OfferService offerService;
    private final BrandService brandService;

    public OfferController(OfferService offerService, BrandService brandService) {
        this.offerService = offerService;
        this.brandService = brandService;
    }

    @ModelAttribute("transmissions")
    public TransmissionEnum[] transmissions() {
        return TransmissionEnum.values();
    }

    @GetMapping("/add")
    public String add(Model model) {

        if (!model.containsAttribute("createOfferDto")) {
            model.addAttribute("createOfferDto", new CreateOfferDTO());
        }

        model.addAttribute("brands", brandService.getAllBrands());

        return "offer-add";
    }

    @PostMapping("/add")
    public String add(
            @Valid CreateOfferDTO createOfferDTO,
            BindingResult bindingResult,
            RedirectAttributes rAtt) {

        if (bindingResult.hasErrors()) {
            rAtt.addFlashAttribute("createOfferDto", createOfferDTO);
            rAtt.addFlashAttribute("org.springframework.validation.BindingResult.createOfferDTO", bindingResult);
            return "redirect:/offer/add";
        }

        UUID newOfferUUID = offerService.createOffer(createOfferDTO);

        return "redirect:/offer/" + newOfferUUID;
    }

    @GetMapping("/{uuid}")
    public String details(@PathVariable("uuid") UUID uuid) {
        return "details";
    }
}
