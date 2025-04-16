package com.kundu.user.service.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Micro_user")
public class User {

    @Id
    @Column(name = "ID") 
    private String UserId;

    @Column(name = "NAME", length = 15)
    private String name;

    @Column(name = "CITY")
    private String city;

    @Column(name = "Email")
    private String email;

    @Column(name = "ABOUT")
    private String about;

}
