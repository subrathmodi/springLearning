package com.subrath.foodDeliveryApp.foodDeliveryApp.dto;

import com.subrath.foodDeliveryApp.foodDeliveryApp.entities.enums.Roles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String name;
    private String email;
    private Set<Roles> roles;
}
