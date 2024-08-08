package com.personalwebsite.services;

import java.util.List;

import com.personalwebsite.entities.Technology;

public interface TechnologyService {
    Technology saveTechnology(Technology technology);
    List<Technology> getAllTechnologies();
    Technology getTechnologyById(Long id);
    void deleteTechnology(Long id);
}
