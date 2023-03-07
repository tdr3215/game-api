package com.trose.GameAPI.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trose.GameAPI.model.User;

public interface UserRepository extends JpaRepository<User,Long>{
Optional<User> findByUserName(String username);
}
