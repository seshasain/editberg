package com.editberg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.editberg.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}