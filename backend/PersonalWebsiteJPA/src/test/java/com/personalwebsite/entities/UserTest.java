package com.personalwebsite.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void testUser() {
        User user = new User();
        user.setUsername("testuser");
        user.setEmail("email");

        assertEquals("testuser", user.getUsername());
        assertEquals("email", user.getEmail());
    }
}
