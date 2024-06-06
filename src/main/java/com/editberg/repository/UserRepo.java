package com.editberg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.editberg.config.CustomUser;
import com.editberg.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	public User findByEmail(String emaill);

}
