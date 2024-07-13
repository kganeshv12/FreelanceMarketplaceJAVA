# ObjectOrientedAnalysisandDesignwithJava

# OnlineFreelanceMarketplace - ProjectReport

```
KGaneshVaidyanathan
PES1UG21CS
KSiddharthRao
PES1UG21CS
MSVarun
PES1UG21CS
KousthubRMenon
PES1UG21CS
Mentor:Prof.BhargaviMokashi
```


## Table of Contents

- [Introduction](#introduction)
- [Patterns](#patterns)
  - [Factory Pattern](#factory-pattern)
  - [Data Transfer Object](#data-transfer-object)
  - [Adapter Pattern](#adapter-pattern)
  - [Singleton Pattern](#singleton-pattern)
- [Principles](#principles)
  - [Single Responsibility Principle (SRP)](#single-responsibility-principle-srp)
  - [High Cohesion](#high-cohesion)
  - [Low Coupling](#low-coupling)
  - [Creator Principle](#creator-principle)
  - [Controller Principle](#controller-principle)
- [Installation](#installation)

## Introduction

The Online Freelance Marketplace project leverages Object-Oriented Analysis and Design (OOAD) principles using Java and Spring Boot. This project aims to provide a robust platform for freelancers to offer services and for customers to procure them efficiently. The project adheres to various design patterns and principles to ensure maintainability, scalability, and efficiency.

## Patterns

### Factory Pattern

We employ the factory pattern to streamline the creation of services offered by freelancers, ensuring a structured approach to service instantiation and management within our system.

### Data Transfer Object

By utilizing the DTO pattern, we centralize service data storage, facilitating efficient transfer and manipulation of information across various components of our application as needed.

### Adapter Pattern

Leveraging Spring Boot's JPA repository classes, we seamlessly convert Java code into database entities and relationships, enabling compatibility with diverse backend databases like H2, MySQL, or PostgreSQL.

### Singleton Pattern

Through the implementation of a singleton, we ensure the existence of only one instance of the "factory" product, promoting resource efficiency and consistent access within our system.


## Principles

### Single Responsibility Principle (SRP)

Our system adheres to SRP by organizing controllers into distinct functionalities such as login, registration, purchase, and operations for both freelancers and customers, promoting clear code structure and maintainability.

### High Cohesion

We design our system components with high cohesion, ensuring that each module or class focuses on a specific task or responsibility, leading to better code readability, reusability, and easier maintenance.


### Low Coupling

By minimizing interdependencies between modules or classes, we achieve low coupling, enhancing the flexibility, scalability, and testability of our system, while reducing the risk of unintended side effects during modifications or updates.

### Creator Principle

We emphasize the importance of encapsulating object creation logic, promoting code clarity, flexibility, and ease of extension, thereby facilitating the evolution of our system over time.

### Controller Principle

We delegate control logic to specialized controller components, ensuring a clear separation of concerns and promoting modularization, which enhances code organization and simplifies maintenance.

## Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/kganeshv12/FreelanceMarketplaceJAVA.git
   cd FreelanceMarketplaceJAVA
   ```
2. **Configure the database:**

    Update the application.properties file in the src/main/resources directory with your database connection details.

3. **Install dependencies and build the project:**

    ```bash
    mvn clean install
    ```
    Run the application:
    ```bash
    mvn spring-boot:run
    ```
    The application will start running on http://localhost:8080.
