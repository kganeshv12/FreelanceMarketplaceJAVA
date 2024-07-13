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
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Acknowledgments](#acknowledgments)

## Introduction

The Online Freelance Marketplace project leverages Object-Oriented Analysis and Design (OOAD) principles using Java and Spring Boot. This project aims to provide a robust platform for freelancers to offer services and for customers to procure them efficiently. The project adheres to various design patterns and principles to ensure maintainability, scalability, and efficiency.

## Patterns

### Factory Pattern

We employ the factory pattern to streamline the creation of services offered by freelancers, ensuring a structured approach to service instantiation and management within our system.

![Factory Pattern](https://via.placeholder.com/800x400.png?text=Factory+Pattern+Diagram)

### Data Transfer Object

By utilizing the DTO pattern, we centralize service data storage, facilitating efficient transfer and manipulation of information across various components of our application as needed.

![Data Transfer Object](https://via.placeholder.com/800x400.png?text=DTO+Pattern+Diagram)

### Adapter Pattern

Leveraging Spring Boot's JPA repository classes, we seamlessly convert Java code into database entities and relationships, enabling compatibility with diverse backend databases like H2, MySQL, or PostgreSQL.

![Adapter Pattern](https://via.placeholder.com/800x400.png?text=Adapter+Pattern+Diagram)

### Singleton Pattern

Through the implementation of a singleton, we ensure the existence of only one instance of the "factory" product, promoting resource efficiency and consistent access within our system.

![Singleton Pattern](https://via.placeholder.com/800x400.png?text=Singleton+Pattern+Diagram)

## Principles

### Single Responsibility Principle (SRP)

Our system adheres to SRP by organizing controllers into distinct functionalities such as login, registration, purchase, and operations for both freelancers and customers, promoting clear code structure and maintainability.

![Single Responsibility Principle](https://via.placeholder.com/800x400.png?text=SRP+Diagram)

### High Cohesion

We design our system components with high cohesion, ensuring that each module or class focuses on a specific task or responsibility, leading to better code readability, reusability, and easier maintenance.

![High Cohesion](https://via.placeholder.com/800x400.png?text=High+Cohesion+Diagram)

### Low Coupling

By minimizing interdependencies between modules or classes, we achieve low coupling, enhancing the flexibility, scalability, and testability of our system, while reducing the risk of unintended side effects during modifications or updates.

![Low Coupling](https://via.placeholder.com/800x400.png?text=Low+Coupling+Diagram)

### Creator Principle

We emphasize the importance of encapsulating object creation logic, promoting code clarity, flexibility, and ease of extension, thereby facilitating the evolution of our system over time.

![Creator Principle](https://via.placeholder.com/800x400.png?text=Creator+Principle+Diagram)

### Controller Principle

We delegate control logic to specialized controller components, ensuring a clear separation of concerns and promoting modularization, which enhances code organization and simplifies maintenance.

![Controller Principle](https://via.placeholder.com/800x400.png?text=Controller+Principle+Diagram)

## Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/online-freelance-marketplace.git
   cd online-freelance-marketplace
