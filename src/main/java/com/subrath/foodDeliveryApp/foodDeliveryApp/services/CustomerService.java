package com.subrath.foodDeliveryApp.foodDeliveryApp.services;

import com.subrath.foodDeliveryApp.foodDeliveryApp.entities.Customer;
import com.subrath.foodDeliveryApp.foodDeliveryApp.entities.User;

public interface CustomerService {

    Customer createNewCustomer(User user);
}
