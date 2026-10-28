package com.college;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class HelloControllerTest {
    @Test
    void homeReturnsDemoPage() {
        assertTrue(new HelloController().home().contains("CI/CD Demo"));
    }
}