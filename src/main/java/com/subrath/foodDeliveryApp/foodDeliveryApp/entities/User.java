package com.subrath.foodDeliveryApp.foodDeliveryApp.entities;

import com.subrath.foodDeliveryApp.foodDeliveryApp.entities.enums.Roles;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "app_user")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;
    @Column(unique = true)
    public String email;
    public String password;

    @ElementCollection(fetch = FetchType.LAZY)
    @Enumerated(EnumType.STRING)
    private Set<Roles> roles;

}
