package org.smudge.petstore

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("person")
class PersonController(
        @Autowired
        private val personService: PersonService
) {

    @GetMapping
    fun getPerson(@RequestParam id: Int): Person {
        return personService.getPerson(id)
    }

    @PostMapping
    fun createPerson(@RequestBody newPerson: Person): Person {
        return personService.createPerson(newPerson.name)
    }

    @PutMapping
    fun changeName(@RequestParam id: Int, @RequestParam newName: String = "Bob"): Person {
        return personService.changeName(id, newName)
    }
}