package com.personalwebsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personalwebsite.entities.Portfolio;

@Repository
public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
}
