package com.subrath.foodDeliveryApp.foodDeliveryApp.services.impl;

import com.subrath.foodDeliveryApp.foodDeliveryApp.entities.Customer;
import com.subrath.foodDeliveryApp.foodDeliveryApp.entities.User;
import com.subrath.foodDeliveryApp.foodDeliveryApp.repositories.CustomerRepository;
import com.subrath.foodDeliveryApp.foodDeliveryApp.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final ModelMapper modelMapper;
    private final CustomerRepository customerRepository;

    @Override
    public Customer createNewCustomer(User user) {
        Customer customer = Customer
                .builder()
                .user(user)
                .rating(0.0)
                .build();
        return customerRepository.save(customer);
    }
}
