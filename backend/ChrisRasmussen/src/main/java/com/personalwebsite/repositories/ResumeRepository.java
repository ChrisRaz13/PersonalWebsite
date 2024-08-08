package com.personalwebsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personalwebsite.entities.Resume;

@Repository
public interface ResumeRepository extends JpaRepository<Resume, Long> {
}
