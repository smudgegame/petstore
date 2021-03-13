package org.smudge.petstore;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Service
public class PetService {
    //Pet id to Pet
    private Map<Integer, Pet> pets = new HashMap<>();

    public PetService(){
        this.pets.put(0, new Pet(0, 0, "Smudge", "cat"));
        this.pets.put(1, new Pet(1, 1, "Tony", "cat"));
        this.pets.put(2, new Pet(1, 2, "Pepper", "bird"));
        this.pets.put(3, new Pet(2, 3, "Jack", "dog"));
    }

    public Pet getPet(int id) {
        return pets.get(id);
    }

    public Pet createPet(int ownerId, String name, String type) {
        Pet pet = new Pet(ownerId, getNextKey(), name, type);
        this.pets.put(pet.getId(),pet);
        return pet;
    }

    private int getNextKey() {
        return Collections.max(this.pets.keySet())+1;
    }

    public Pet changeName(int petId, String newName) {
        Pet pet = getPet(petId);
        pet.setName(newName);
        return pet;
    }
}
