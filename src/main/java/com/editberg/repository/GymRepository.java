package com.editberg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.editberg.entity.Gym;

public interface GymRepository extends JpaRepository<Gym, Long> {
}
