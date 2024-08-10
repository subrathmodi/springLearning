package com.subrath.foodDeliveryApp.foodDeliveryApp.repositories;

import com.subrath.foodDeliveryApp.foodDeliveryApp.entities.Customer;
import com.subrath.foodDeliveryApp.foodDeliveryApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
