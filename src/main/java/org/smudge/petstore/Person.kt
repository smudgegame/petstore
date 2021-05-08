package org.smudge.petstore

import io.swagger.annotations.ApiModelProperty

class Person(
        @ApiModelProperty(accessMode = ApiModelProperty.AccessMode.READ_ONLY, example = "0")
        val id: Int = 0,

        @ApiModelProperty(required = true, example = "Bob")
        var name: String
)