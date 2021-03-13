package org.smudge.petstore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("health")
public class HealthcheckController {
    @GetMapping
    public String getHealth() {
        return "healthy";
    }
}

