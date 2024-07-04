package com.editberg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.editberg.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
