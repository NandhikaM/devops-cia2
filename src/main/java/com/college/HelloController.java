package com.college;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String home() {
        return "<h1>CI/CD Demo - Version 2</h1><p>Deployed automatically via GitHub Actions to AKS</p>";
    }
}