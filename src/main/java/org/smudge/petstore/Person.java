package org.smudge.petstore;

import io.swagger.annotations.ApiModelProperty;

public class Person {

    @ApiModelProperty(accessMode = ApiModelProperty.AccessMode.READ_ONLY, example = "0")
    private int id;

    @ApiModelProperty(required = true, example = "Joe")
    private String name;

    public Person() {

    }

    public Person(int id, String name) {
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

}
