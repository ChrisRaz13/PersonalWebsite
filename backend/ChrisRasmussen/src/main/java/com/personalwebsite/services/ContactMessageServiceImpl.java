package com.personalwebsite.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personalwebsite.entities.ContactMessage;
import com.personalwebsite.repositories.ContactMessageRepository;

@Service
public class ContactMessageServiceImpl implements ContactMessageService {

    @Autowired
    private ContactMessageRepository contactMessageRepository;

    @Override
    public ContactMessage saveContactMessage(ContactMessage contactMessage) {
        return contactMessageRepository.save(contactMessage);
    }

    @Override
    public List<ContactMessage> getAllContactMessages() {
        return contactMessageRepository.findAll();
    }

    @Override
    public ContactMessage getContactMessageById(Long id) {
        return contactMessageRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteContactMessage(Long id) {
        contactMessageRepository.deleteById(id);
    }
}
