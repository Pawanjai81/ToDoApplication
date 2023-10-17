# <h1 align = "center"> To-Do List Application </h1>
___ 
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-4.0-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.1.0-brightgreen.svg" />
</a>
  </a>
     <img alt = "GPL v3" src="https://img.shields.io/badge/License-GPLv3-blue.svg" />
    </a>
</p>

---

<p align="left">

<!-- Project Description -->
<p align="center">A Simple To-Do list application built with Spring Boot</p>

<!-- Table of Contents -->
## Table of Contents
1. [Overview](#overview)
2. [Technologies Used](#technologies-used)
3. [Project Structure](#project-structure)
4. [Database Design](#database-design)
5. [Key Features](#key-features)
6. [Getting Started](#getting-started)
7. [Usage](#usage)
8. [API Endpoints](#api-endpoints)
9. [License](#license)
10. [Acknowledgments](#acknowledgments)
11. [Contact](#contact)

<!-- Project Overview -->
## Overview
This is a simple ToDo list application built with Spring Boot. It allows users to create, update, and manage their tasks.

<!-- Technologies Used -->
## Technologies Used
- Java 17
- Spring Boot
- Spring Web
- Spring Data
- Lombok (for simplifying Java code)

<!-- Project Structure -->
## Project Structure
The project follows a typical Spring Boot project structure:

- `TodoControl`: Controller layer for handling HTTP requests and responses.
- `TodoService`: Service layer for business logic.
- `TodoRepo`: Repository layer for data storage.
- `BeanManufacturer`: Configuration for creating beans.
- `Todo` (Entity): Entity class representing a ToDo item.

<!-- Database Design -->
## Database Design
The application uses an in-memory list of ToDo items for simplicity.

<!-- Key Features -->
## Key Features
- List all todos.
- Get done todos.
- Get pending todos.
- Add new todos.
- Update the status of a todo.
- Remove a todo.

<!-- Getting Started -->
## Getting Started
1. Clone the repository:
2. Navigate to the project directory:
3. Build the project:
4. Run the application:

   
<!-- Usage -->
## Usage
- Access the application at `http://localhost:8080`.
- Use the provided API endpoints to manage your todos.

<!-- API Endpoints -->
## API Endpoints
- `GET /todos`: Get all todos.
- `GET /Todo/done`: Get done todos.
- `GET /Todo/pending`: Get pending todos.
- `POST /Todo`: Add a new todo.
- `PUT /todo/status/{id}/{status}`: Update the status of a todo.
- `DELETE /todo/delete?id={id}`: Remove a todo.

