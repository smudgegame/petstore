package org.smudge.petstore

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PersonService(
        @Autowired
        private val repo: PersonRepository
) {

    fun getPerson(id: Int): Person {
        return repo.findById(id).orElse(null)?.toBusinessObject()
                ?: throw Exception("No person found with id $id")
    }

    fun createPerson(name: String): Person {
        val newPerson = PersonEntity(0, name)
        repo.save(newPerson)
        return newPerson.toBusinessObject()
    }

    fun changeName(id: Int, newName: String): Person {
        val person = repo.findById(id).get()
        person.name = newName
        repo.save(person)
        return person.toBusinessObject()
    }
}