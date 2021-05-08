package org.smudge.petstore

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("health")
class HealthcheckController {

    @GetMapping
    fun health(): String {
        return "Healthy"
    }
}