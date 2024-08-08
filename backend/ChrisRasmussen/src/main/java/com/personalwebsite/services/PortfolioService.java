package com.personalwebsite.services;

import com.personalwebsite.entities.Portfolio;
import java.util.List;

public interface PortfolioService {
    Portfolio savePortfolio(Portfolio portfolio);
    List<Portfolio> getAllPortfolios();
    Portfolio getPortfolioById(Long id);
    void deletePortfolio(Long id);
}
