# Job Board App For Testing REST API

## Overview

Simple SpringBoot web app for testing REST API with Postman and RestAssured.

## Postman Collections

TBA

## RestAssured Project

TBA

## OpeanAPI definition

Swagger available at:

`localhost:8080/swagger-ui.html`

## H2 Console (only on feature/DB branch)

There is H2 Database with console available at feature/DB branch, main branch has database implemented in memory as ConcurrentHashMap. 

Accessible via:

`localhost:8080/h2-console`

No credentials needed to login (leave the fields empty).
Name of the db: `jdbc:h2:file:./jobs-db`

If you wish you can define user and password in application.properties:
```
spring.datasource.username=ENTER_YOUR_USERNAME
spring.datasource.password=ENTER_YOUR_PASSWORD
```

Database is persistent.