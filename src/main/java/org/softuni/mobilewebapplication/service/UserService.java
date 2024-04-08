package org.softuni.mobilewebapplication.service;

import org.softuni.mobilewebapplication.model.dto.UserLoginDTO;
import org.softuni.mobilewebapplication.model.dto.UserRegistrationDTO;

public interface UserService {
    void userRegistration(UserRegistrationDTO userRegistrationDTO);

    boolean loginUser(UserLoginDTO userLoginDTO);

    void logoutUser();
}
