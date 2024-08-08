package com.personalwebsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.personalwebsite.entities.ContactMessage;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {
}
