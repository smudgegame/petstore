package org.smudge.petstore;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Service
public class PersonService {
    //Person id to person
    private Map<Integer, Person> persons = new HashMap<>();

    public PersonService() {
        this.persons.put(0, new Person(0, "Aaron"));
        this.persons.put(1, new Person(1, "Austin"));
        this.persons.put(2, new Person(2, "Jennifer"));
    }

    public Person getPerson(int id) {
        return persons.get(id);
    }

    public Person createPerson(String name) {
        Person newPerson = new Person(getNextKey(), name);
        this.persons.put(newPerson.getId(), newPerson);
        return newPerson;
    }

    private int getNextKey() {
        return Collections.max(this.persons.keySet()) + 1;
    }

    public Person changeName(int id, String newName) {
        Person person = getPerson(id);
        person.setName(newName);
        return person;
    }
}
