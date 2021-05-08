package org.smudge.petstore

import org.springframework.stereotype.Service

@Service
class PetService {

    private val pets = mutableMapOf(
            0 to Pet(0,0,"Smudge", "cat"),
            1 to Pet(1,1,"Tony", "cat"),
            2 to Pet(1,2,"Pepper","bird"),
            3 to Pet(2,3, "Jack", "dog")
    )

    fun getPet(id: Int): Pet {
        return pets[id] ?: throw Exception("No pet found with id $id")
    }

    fun createPet(ownerId: Int, name: String, type: String): Pet {
        val pet = Pet(ownerId, nextKey(), name, type)
        pets[pet.id] = pet
        return pet
    }

    private fun nextKey(): Int {
        return (pets.keys.maxOrNull() ?: 0) + 1
    }

    fun changeName(petId: Int, newName: String): Pet {
        val pet = getPet(petId)
        pet.name = newName
        return pet
    }


}