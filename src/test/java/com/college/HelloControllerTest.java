package com.college;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class HelloControllerTest {
    @Test
    void homeShowsTitleAndConfigMessage() {
        String page = new HelloController("test message").home();
        assertTrue(page.contains("CI/CD Demo"));
        assertTrue(page.contains("test message"));
    }
}