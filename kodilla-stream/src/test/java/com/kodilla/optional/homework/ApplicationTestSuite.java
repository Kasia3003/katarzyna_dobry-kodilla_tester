package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTestSuite {
    @Test
    public void testGetTeachersname() {
        Application application = new Application();
        String teachersname = String.valueOf(application.equals(" "));
        assertEquals(" ");
    }

    private void assertEquals(String teacher) {
    }
}