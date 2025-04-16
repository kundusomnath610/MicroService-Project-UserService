package com.kundu.user.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kundu.user.service.entities.User;

public interface UserRepositories extends JpaRepository<User, String> {
    
}
