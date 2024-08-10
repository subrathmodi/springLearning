package com.subrath.foodDeliveryApp.foodDeliveryApp.services;

import com.subrath.foodDeliveryApp.foodDeliveryApp.dto.SignupDto;
import com.subrath.foodDeliveryApp.foodDeliveryApp.dto.UserDto;

public interface AuthService {

  //  String login(String email, String password);

    UserDto signup(SignupDto signupDto);

   // DriverDto onboardNewDriver(Long userId);
}
