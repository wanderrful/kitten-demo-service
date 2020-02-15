package com.example.restTest.repository

import com.example.restTest.model.Kitten
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface KittenRepository extends MongoRepository<Kitten, String> {
    Kitten findByName(String name)
}
