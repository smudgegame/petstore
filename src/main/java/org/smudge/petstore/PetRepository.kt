package org.smudge.petstore

import org.springframework.data.repository.CrudRepository

interface PetRepository : CrudRepository<PetEntity,Int>