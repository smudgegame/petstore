package org.smudge.petstore;

import javax.persistence.*;

@Entity
@Table(name = "pet")
public class PetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int ownerId;
    private String name;
    private String type;

    public PetEntity(){

    }

    public PetEntity(int id, int ownerId, String name, String type){
        this.id = id;
        this.ownerId = ownerId;
        this.name = name;
        this.type = type;
    }

   public int getId(){
        return id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public String getName(){
        return name;
    }

    public String getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Pet toBusinessObject(){
        return new Pet(id, ownerId, name, type);
    }
}
