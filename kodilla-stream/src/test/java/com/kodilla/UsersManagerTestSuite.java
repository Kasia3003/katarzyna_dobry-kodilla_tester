package com.kodilla;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UsersManagerTestSuite {
    @Test
    public void testFilterChemistGroupUsernames() {
        UsersManager usersManager = new UsersManager();
        String username = String.valueOf(usersManager.equals("Chemists"));
        assertEquals("Chemists");
    }
    private void assertEquals(String group) {
    }
}