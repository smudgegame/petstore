package org.smudge.petstore

import javax.persistence.*

@Entity
@Table(name = "person")
class PersonEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int = 0,
        var name: String = "Default"
) {

    fun toBusinessObject(): Person {
        return Person(id, name)
    }
}