package com.subrath.foodDeliveryApp.foodDeliveryApp.repositories;

import com.subrath.foodDeliveryApp.foodDeliveryApp.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {

}
