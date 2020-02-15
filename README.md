# Spring Microservice Demo

This **Spring Microservice**, written in Groovy, demonstrates CRUD operations on both a **Mongo database** back-end (through a "Kitten" route) as well as an external service (through a "Post" route).

With the Kitten routes, we're using **Spring Data** to demonstrate CRUD operations on a Mongo collection.

With the Post routes, we're demonstrating a use case for the `reqres.in` online service in place of an actual, live API. In a real production environment, we could abstract the URL into a configuration file and feed that into the project via some orchstration DNS resolver (e.g. **Kubernetes**).

## Setup

### Software Requirements

- Java (JDK 11)
- Groovy 

### To run

- `cd` into this root folder
- In the `/src/main/resources/application.yml` file, use whatever Mongo connection URI string for the `uri:` field (replacing the placeholder text) 
- Use `./gradlew bootRun` to install package dependencies and run the microservice
- Perform an HTTP request on `https://localhost:8080` using one of the routes described below in this Readme file  

## Structure

For each route, we are making use of a **Controller -> Service -> Delegate -> Repository** flow of information. In a real production environment, these layers of indirection are very useful to prevent the microservice from becoming unreadable, as we often need to assemble data from multiple external sources before returning content to the user.

## API Routes

Route handlers are defined with the classes contained in `com.example.restTest.controller` package folder

### Kittens

- GET `/kitten` - Retrieves all kittens

- GET `/kitten/id/{id}` Retrieves a single kitten with the given Mongo ObjectId

- GET `/kitten/name/{name}` Retrieves a single kitten based on the given name

- POST `/kitten/` Adds a kitten to the Mongo collection

- PATCH `/kitten/` Updates a kitten object in Mongo, by its Id

- DELETE `/kitten/id/{id}` Removes a kitten from the Mongo collection

### Posts

- GET `/post/` Retrieves all forum posts

- GET `/post/{postId}` Retrieves a specific post based on its integer Id