package com.editberg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.editberg.entity.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
