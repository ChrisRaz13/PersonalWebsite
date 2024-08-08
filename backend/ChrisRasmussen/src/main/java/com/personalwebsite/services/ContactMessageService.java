package com.personalwebsite.services;

import java.util.List;

import com.personalwebsite.entities.ContactMessage;

public interface ContactMessageService {
    ContactMessage saveContactMessage(ContactMessage contactMessage);
    List<ContactMessage> getAllContactMessages();
    ContactMessage getContactMessageById(Long id);
    void deleteContactMessage(Long id);
}