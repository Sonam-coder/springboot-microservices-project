# Online Order Management System – Spring Boot Microservices

## Project Overview
The **Online Order Management System** is a backend microservices-based application designed to manage users, products, and orders efficiently.  
The system is built using **Spring Boot** and follows **RESTful microservices architecture**, ensuring scalability, maintainability, and loose coupling between services.

This project demonstrates real-world backend development practices such as service separation, REST APIs, database integration, and clean Git management.

---

##  Microservices Architecture

The application consists of the following independent services:

### 1️ User Service
- Manages user registration and authentication
- Handles user-related operations
- Exposes REST APIs for user management

### 2️ Product Service
- Manages product catalog
- Handles product creation, updates, and retrieval
- Exposes REST APIs for product operations

### 3️ Order Service
- Manages order creation and order details
- Communicates with User and Product services
- Handles order status and total calculation

Each service runs independently and has its own database access layer.

---

##  Tech Stack

- **Java 11**
- **Spring Boot**
- **Spring Data JPA (Hibernate)**
- **RESTful APIs**
- **Oracle Database**
- **Maven**
- **Git & GitHub**
- **Postman (API testing)**

---

##  Project Structure
springboot-microservices-project
│
├── user-service
│ ├── src/main/java
│ ├── src/main/resources
│ └── pom.xml
│
├── product-service
│ ├── src/main/java
│ ├── src/main/resources
│ └── pom.xml
│
├── order-service
│ ├── src/main/java
│ ├── src/main/resources
│ └── pom.xml
│
└── .gitignore


---

## How to Run the Project

### Prerequisites
- Java 11 installed
- Maven installed
- Oracle Database running
- Git installed

### Steps to Run Each Service

---bash
cd user-service
mvn clean install
mvn spring-boot:run
###
cd product-service
mvn clean install
mvn spring-boot:run
###
cd order-service
mvn clean install
mvn spring-boot:run

### API Testing
All APIs can be tested using Postman.
Example endpoints:
/users
/products
/orders

### Key Features
Microservices-based architecture
RESTful API design
Independent service deployment
Database integration using JPA/Hibernate
Clean Git history and professional project structure



