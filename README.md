# Spring Boot CRUD Employee Management

A Spring Boot application demonstrating CRUD operations on Employee records using REST APIs, Spring Data JPA, MySQL, and layered architecture.

## Features

- Employee CRUD Operations
- RESTful APIs
- Layered Architecture
- Spring Data JPA
- MySQL Database
- Auto-generated Primary Key
- Maven Project

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Lombok
- Eclipse IDE

## Project Structure

```
src
├── main
│   ├── java
│   │   └── com.apple.springboot_crudtask
│   │       ├── controller
│   │       ├── service
│   │       ├── dao
│   │       ├── repository
│   │       └── dto
│   └── resources
│       └── application.properties
```

## Layers

- Controller
- Service
- DAO
- Repository
- Entity (DTO)

## REST API

### Insert Employee

```
POST /students
```

### Sample Request Body

```json
{
  "name":"Madiha",
  "email":"madiha@gmail.com",
  "mobileNumber":987654321,
  "salary":50000,
  "institute":"JSpiders"
}
```

### Response

```
data inserted
```

## Technologies Demonstrated

- Spring Boot
- REST Controller
- Dependency Injection
- Spring Data JPA
- Hibernate ORM
- MySQL
- Lombok

## Annotations Used

- @RestController
- @RequestMapping
- @PostMapping
- @Service
- @Repository
- @Entity
- @Table
- @Id
- @GeneratedValue
- @Autowired

## How to Run

1. Clone the repository.
2. Configure MySQL in `application.properties`.
3. Update Maven dependencies.
4. Run the Spring Boot application.
5. Test the APIs using Postman.

## Learning Outcomes

- Spring Boot
- REST APIs
- Spring Data JPA
- Hibernate
- Layered Architecture
- CRUD Operations

## Author

**Madiha Azam Ahmed**

GitHub: https://github.com/madihaazamahmed-droid# SpringBoot-CRUD-Employee-Management
