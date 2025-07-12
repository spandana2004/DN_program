# JPA vs Hibernate vs Spring Data JPA

This project demonstrates the difference and usage of:
- **JPA (Java Persistence API)** – a specification
- **Hibernate** – an implementation of JPA
- **Spring Data JPA** – abstraction over JPA, provides repository support

## Structure
- `Country` entity for table mapping
- Repository using Spring Data JPA
- Service layer for business logic
- Main application to test

## Tech Stack
- Java 11+
- Spring Boot 2.7+
- MySQL
- Maven

## Setup Instructions
1. Create MySQL schema:
```sql
create schema ormlearn;
create table country (code varchar(2) primary key, name varchar(50));
insert into country values ('IN', 'India'), ('US', 'United States');
```
2. Update DB credentials in `application.properties`
3. Run main class and observe logs