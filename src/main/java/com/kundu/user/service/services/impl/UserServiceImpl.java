/*
 *  To Implement the User Services Interface method
 * In this file
 */

package com.kundu.user.service.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kundu.user.service.entities.User;
import com.kundu.user.service.exception.ResourceNotFoundException;
import com.kundu.user.service.repositories.UserRepositories;
import com.kundu.user.service.services.UserServies;

import io.micrometer.core.instrument.Meter.Id;

@Service
public class UserServiceImpl implements UserServies{

    @Autowired
    private UserRepositories userRepositories;

    @Override
    public User savUser(User user) {
        return userRepositories.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepositories.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepositories.findById(userId).orElseThrow(() -> 
        new ResourceNotFoundException("User with given id is not found!! " + userId));
    }

    @Override
    public User deleteUser(String userId) {
        return userRepositories.deleteById(userId)
            .orElseThrow(() -> 
            new ResourceNotFoundException("User with given id is not found!! " + userId));
    }

    @Override
    public User updatUser(String UserId, User user) {
        return userRepositories.findById(UserId).get();
    }

    

}
