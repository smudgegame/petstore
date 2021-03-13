package org.smudge.petstore;


import io.swagger.annotations.ApiModelProperty;

public class Pet {

    @ApiModelProperty(required = true, example = "0")
    private int ownerId;

    @ApiModelProperty(accessMode = ApiModelProperty.AccessMode.READ_ONLY, example = "0")
    private int id;

    @ApiModelProperty(required = true, example = "Jim")
    private String name;

    @ApiModelProperty(required = true, example = "Cat")
    private String type;

    public Pet() {
    }

    public Pet(int ownerId, int id, String name, String type) {
        this.ownerId = ownerId;
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
