package org.softuni.mobilewebapplication.service;

import org.softuni.mobilewebapplication.model.dto.UserLoginDTO;
import org.softuni.mobilewebapplication.model.dto.UserRegistrationDTO;
import org.softuni.mobilewebapplication.model.entity.UserEntity;
import org.softuni.mobilewebapplication.repository.UserRepository;
import org.softuni.mobilewebapplication.util.CurrentUser;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final CurrentUser currentUser;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder, CurrentUser currentUser) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.currentUser = currentUser;
    }

    @Override
    public void userRegistration(UserRegistrationDTO userRegistrationDTO) {
        userRepository.save(map(userRegistrationDTO));
    }

    @Override
    public boolean loginUser(UserLoginDTO userLoginDTO) {
        boolean isLoginSuccessful = false;

        Optional<UserEntity> user = userRepository.findByEmail(userLoginDTO.email());

        if (user.isEmpty() || !passwordEncoder.matches(userLoginDTO.password(), user.get().getPassword())) {
            currentUser.logout();
            return isLoginSuccessful;
        }

        isLoginSuccessful = true;

        currentUser.setLogged(true)
                .setFirstName(user.get().getFirstName())
                .setLastName(user.get().getLastName());

        return isLoginSuccessful;
    }

    @Override
    public void logoutUser() {
        currentUser.logout();
    }

    private UserEntity map(UserRegistrationDTO userRegistrationDTO) {
        return new UserEntity()
                .setActive(true)
                .setFirstName(userRegistrationDTO.firstName())
                .setLastName(userRegistrationDTO.lastName())
                .setEmail(userRegistrationDTO.email())
                .setPassword(passwordEncoder.encode(userRegistrationDTO.password()));
    }
}
