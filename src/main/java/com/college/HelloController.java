package com.college;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final String message;

    public HelloController(@Value("${APP_MESSAGE:Default message (no ConfigMap found)}") String message) {
        this.message = message;
    }

    @GetMapping("/")
    public String home() {
        return "<h1>CI/CD Demo - Version 2</h1>"
                + "<p>Deployed automatically via GitHub Actions to AKS</p>"
                + "<p>Message from ConfigMap: " + message + "</p>";
    }
}