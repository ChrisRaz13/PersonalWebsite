package com.personalwebsite.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personalwebsite.entities.Technology;
import com.personalwebsite.repositories.TechnologyRepository;

@Service
public class TechnologyServiceImpl implements TechnologyService {

    @Autowired
    private TechnologyRepository technologyRepository;

    @Override
    public Technology saveTechnology(Technology technology) {
        return technologyRepository.save(technology);
    }

    @Override
    public List<Technology> getAllTechnologies() {
        return technologyRepository.findAll();
    }

    @Override
    public Technology getTechnologyById(Long id) {
        return technologyRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteTechnology(Long id) {
        technologyRepository.deleteById(id);
    }
}
