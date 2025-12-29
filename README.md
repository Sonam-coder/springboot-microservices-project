# Online Order Management System

A Spring Boot–based microservices application that handles user management,
product catalog, and order processing.

## Tech Stack
- Java 11
- Spring Boot
- Spring Data JPA
- REST APIs
- Oracle Database
- Maven
- Git & GitHub

## Microservices
- User Service
- Product Service
- Order Service

## Features
- User registration and authentication
- Product management (CRUD)
- Order placement with multiple items
- RESTful communication between services

## Architecture
- Microservices architecture
- Layered structure (Controller, Service, Repository)
- Exception handling & validation

  ## Test APIs (VERY IMPORTANT)
Use Postman.
 ** Test User Service
- POST /auth/register
- POST /auth/login
** Test Product Service
- POST /products
- GET /products
** Test Order Service
- POST /orders
- GET /orders/{id}

## How to Run
1. Clone the repository  
   ```bash
   git clone https://github.com/Sonam-coder/springboot-microservices-project.git
