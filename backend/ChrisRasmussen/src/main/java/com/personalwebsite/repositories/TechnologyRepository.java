package com.personalwebsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalwebsite.entities.Technology;

public interface TechnologyRepository extends JpaRepository<Technology, Long> {
}
