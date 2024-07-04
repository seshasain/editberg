package com.editberg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.editberg.entity.Trainer;

public interface TrainerRepository extends JpaRepository<Trainer, Long> {
}