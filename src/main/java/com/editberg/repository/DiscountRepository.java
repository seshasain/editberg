package com.editberg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.editberg.entity.MemberDiscount;

public interface DiscountRepository extends JpaRepository<MemberDiscount, Long> {
}
