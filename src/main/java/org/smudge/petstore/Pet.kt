package org.smudge.petstore

import io.swagger.annotations.ApiModelProperty

class Pet(
    @ApiModelProperty(required = true, example = "0")
    val ownerId : Int = 0,
    @ApiModelProperty(accessMode = ApiModelProperty.AccessMode.READ_ONLY, example = "0")
    val id : Int = 0,
    @ApiModelProperty(required = true, example = "Jim")
    var name: String,
    @ApiModelProperty(required = true, example = "Cat")
    val type: String
)