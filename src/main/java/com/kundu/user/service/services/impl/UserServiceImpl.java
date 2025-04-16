/*
 *  To Implement the User Services Interface method
 * In this file
 */

package com.kundu.user.service.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kundu.user.service.entities.User;
import com.kundu.user.service.repositories.UserRepositories;
import com.kundu.user.service.services.UserServies;

@Service
public class UserServiceImpl implements UserServies{

    @Autowired
    private UserRepositories userRepositories;

    @Override
    public User savUser(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'savUser'");
    }

    @Override
    public List<User> getAllUsers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllUsers'");
    }

    @Override
    public User getUser(String UserId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUser'");
    }

    @Override
    public void deletUser(String UserId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletUser'");
    }

    @Override
    public User updatUser(String UserId, User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatUser'");
    }

    

}
