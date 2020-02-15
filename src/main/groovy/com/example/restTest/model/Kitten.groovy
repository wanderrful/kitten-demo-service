package com.example.restTest.model

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "kittens")
class Kitten {
    String id
    String name
}
