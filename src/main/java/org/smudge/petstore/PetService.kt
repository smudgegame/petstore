package org.smudge.petstore


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PetService (
        @Autowired
        private val repo: PetRepository
        ) {

    fun getPet(id: Int): Pet {
        return repo.findById(id).orElse(null)?.toBusinessObject()
                ?: throw Exception("No pet found with id $id")
    }

    fun createPet(id: Int,ownerId: Int, name: String, type: String): Pet {
        val newPet = PetEntity(0,ownerId,name,type)
        repo.save(newPet)
        return newPet.toBusinessObject()
    }

    fun changeName(petId: Int, ownerId: Int, newName: String, type: String): Pet {
        val pet = repo.findById(petId).get()
        pet.name = newName
        repo.save(pet)
        return pet.toBusinessObject()
    }


}