package com.personalwebsite.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void testUser() {
        User user = new User();
        user.setUsername("testuser");
        user.setPassword("password");

        assertEquals("testuser", user.getUsername());
        assertEquals("password", user.getPassword());
    }
}
