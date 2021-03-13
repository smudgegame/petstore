package org.smudge.petstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("pet")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping()
    public Pet getPet(@RequestParam int id) {
        return petService.getPet(id);
    }

    @PostMapping
    public Pet createPet(@RequestBody Pet newPet) {
        return petService.createPet(newPet.getOwnerId(), newPet.getName(), newPet.getType());
    }

    @PutMapping
    public Pet changeName(@RequestParam int id, @RequestParam String newName) {
        return petService.changeName(id, newName);
    }
}

