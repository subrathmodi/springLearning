package com.subrath.foodDeliveryApp.foodDeliveryApp.repositories;

import com.subrath.foodDeliveryApp.foodDeliveryApp.entities.DeliveryPartner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryPartnerRepository extends JpaRepository<DeliveryPartner,Long> {

}
