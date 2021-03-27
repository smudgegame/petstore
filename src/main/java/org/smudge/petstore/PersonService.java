package org.smudge.petstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repo;

    public Person getPerson(int id) {
        return repo.findById(id).get().toBusinessObject();
    }

    public Person createPerson(String name) {
        PersonEntity newPerson = new PersonEntity(0, name);
        repo.save(newPerson);
        return newPerson.toBusinessObject();
    }

    public Person changeName(int id, String newName) {
        Person person = getPerson(id);
        person.setName(newName);
        return person;
    }
}
