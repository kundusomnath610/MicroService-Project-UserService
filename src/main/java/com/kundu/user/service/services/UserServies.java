package com.kundu.user.service.services;

import java.util.List;

import com.kundu.user.service.entities.User;

public interface UserServies {

    User savUser(User user);

    // Get all User
    List<User> getAllUsers();

    // Get single user to get user Id based on User Id
    User getUser(String UserId);

    //Delete User
    void deletUser(String UserId);

    // Update User
    User updatUser(String UserId, User user); 

}
