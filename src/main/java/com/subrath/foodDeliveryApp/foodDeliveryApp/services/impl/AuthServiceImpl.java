package com.subrath.foodDeliveryApp.foodDeliveryApp.services.impl;

import com.subrath.foodDeliveryApp.foodDeliveryApp.dto.SignupDto;
import com.subrath.foodDeliveryApp.foodDeliveryApp.dto.UserDto;
import com.subrath.foodDeliveryApp.foodDeliveryApp.entities.User;
import com.subrath.foodDeliveryApp.foodDeliveryApp.entities.enums.Roles;
import com.subrath.foodDeliveryApp.foodDeliveryApp.exceptions.RuntimeConflictException;
import com.subrath.foodDeliveryApp.foodDeliveryApp.repositories.UserRepository;
import com.subrath.foodDeliveryApp.foodDeliveryApp.services.AuthService;
import com.subrath.foodDeliveryApp.foodDeliveryApp.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{

    private final UserRepository userRepository;
    private final CustomerService customerService;
    private final ModelMapper modelMapper;

    @Override
    public UserDto signup(SignupDto signupDto) {
        User user = userRepository.findByEmail(signupDto.getEmail()).orElse(null);
        if(user != null)
            throw new RuntimeConflictException("Cannot signup, User already exists with email "+signupDto.getEmail());

        User mappedUser = modelMapper.map(signupDto, User.class);
        mappedUser.setRoles(Set.of(Roles.CUSTOMER));
        User savedUser = userRepository.save(mappedUser);

        customerService.createNewCustomer(savedUser);

//        TODO add wallet related service here

        return modelMapper.map(savedUser, UserDto.class);
    }
}
