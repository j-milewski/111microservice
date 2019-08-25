# microservice

Microservice based on Spring Boot and Hibernate which allows adding values to the H2 in-memory database and displaying its contents. Microservice responds to the HTTP requests in JSON format. Project is build using Maven.

At the request of the character: POST http://localhost:8080/add {Name: "value"}
It corresponds to the status of 200 and content added to the database: {id: 1, name: "value"}

The request is validated (checking if the message is empty or NULL).

On http request : GET http://localhost:8080/list microservice return a list of previously added values.
