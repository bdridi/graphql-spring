# Spring boot - Graphql 

## About this project 

Graphql demo with a spring boot application based on hexagonal architecture. 

## Context of the demo application 

In this demo we suppose that the space agency *Spacity* exposes a Graphql api for 
clients in order to offer basic functionalities such as :
- Create a mission 
- Get the list of recent missions
- Get a mission by id

Here is the used graphql schema of the application : 

```graphql
type Capsule {
    id: ID!
    serial: String!
    status: String!
    originalLaunch: String
    flight: String
    type: String
}

type Mission {
    id: ID!
    manufacturer: String!
    name: String!
    website: String,
    capsules: [Capsule]
}

type Query {
    recentMissions(count: Int, offset: Int): [Mission]!
    getMissionById(id: String!): Mission!
}

type Mutation {
    createMission(name: String!, manufacturer: String!, website: String) : Mission!
}
```

## Getting Started

### Prerequisites

To run this project locally, you have to install:
- Java JDK 11
- Maven 3.x

### Run the server 
```bash
mvn spring-boot:run
```
### Interact with the api

The server exposes `Graphiql` tool at `http://localhost:8080/graphiql` that allow us to interact with the api 
and check out the exposed queries. 
