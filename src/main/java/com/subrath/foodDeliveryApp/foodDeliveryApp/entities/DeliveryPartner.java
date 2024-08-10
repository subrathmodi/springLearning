package com.subrath.foodDeliveryApp.foodDeliveryApp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryPartner {

    @Id
    private Long id;

}
