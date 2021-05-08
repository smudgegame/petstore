package org.smudge.petstore

import org.springframework.data.repository.CrudRepository

interface PersonRepository : CrudRepository<PersonEntity, Int>