package org.smudge.petstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping()
    public Person getPerson(@RequestParam int id) {
        return personService.getPerson(id);
    }

    @PostMapping
    public Person createPerson(@RequestBody Person newPerson) {
        return personService.createPerson(newPerson.getName());
    }

    @PutMapping
    public Person changeName(@RequestParam int id, @RequestParam String newName) {
        return personService.changeName(id, newName);
    }
}
