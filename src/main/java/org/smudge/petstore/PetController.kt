package org.smudge.petstore

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("pet")
class PetController(
        @Autowired
        private val petService: PetService
) {

    @GetMapping
    fun getPet(@RequestParam id: Int): Pet {
        return petService.getPet(id)
    }

    @PostMapping
    fun createPet(@RequestBody newPet: Pet): Pet {
        return petService.createPet(newPet.ownerId, newPet.name, newPet.type)
    }

    @PutMapping
    fun changeName(@RequestParam id: Int, @RequestParam newName: String): Pet {
        return petService.changeName(id, newName)
    }
}