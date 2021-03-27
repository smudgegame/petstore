package org.smudge.petstore;

import javax.persistence.*;

@Entity
@Table(name="people")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String name;

    public PersonEntity() {

    }

    public PersonEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public Person toBusinessObject() {
        return new Person(id, name);
    }

}
