package org.softuni.mobilewebapplication.web;

import org.softuni.mobilewebapplication.model.dto.UserRegistrationDTO;
import org.softuni.mobilewebapplication.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/users")
@Controller
public class UserRegisterController {

    private final UserService userService;

    public UserRegisterController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String register() {
        return "auth-register";
    }

    @PostMapping("/register")
    public String register(UserRegistrationDTO userRegistrationDTO) {
        userService.userRegistration(userRegistrationDTO);

        return "redirect:/";
    }
}
