# Job Board App For Testing REST API

## Overview

Simple SpringBoot web app for testing REST API with Postman and RestAssured.

## Postman Collections

Postman Collection for testing master branch is located in:
`.\PostmanCollections\MasterBranch\` folder.

Collection for testing Feature/DB branch is located in:
`.\PostmanCollections\FeatureDbBranch\` folder.

Both consists of all basic CRUD operations, verifying if bad requests are properly handled and E2E scenario.

## RestAssured Project

TBA

## OpeanAPI definition (Swagger)

API documentation available at:

`localhost:8080/swagger-ui.html`

## Database

### Main branch

Main branch has database implemented in memory as ConcurrentHashMap. It acts as in-memory database which means it's non-persistent.

### Feature/DB branch (H2 Console)

There is H2 Database with console available at feature/DB branch, accessible via: 

`localhost:8080/h2-console`

No credentials needed to login (leave the fields empty).
Name of the db: `jdbc:h2:file:./jobs-db`

If you wish you can define user and password in application.properties:
```
spring.datasource.username=ENTER_YOUR_USERNAME
spring.datasource.password=ENTER_YOUR_PASSWORD
```

Database is configured to be kept in a file which makes it persistent.