package com.subrath.foodDeliveryApp.foodDeliveryApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

    private UserDto user;
    private Double rating;
}
