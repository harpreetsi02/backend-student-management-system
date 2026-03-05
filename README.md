# Student Management REST API

A backend REST API built with Spring Boot for managing student records. The application allows users to create, retrieve, update, and delete student data stored in a MySQL database. It follows a clean layered architecture and uses Spring Data JPA for database interaction.

## Features

* Create new student records
* Retrieve all students
* Fetch student details by ID
* Update existing student information
* Delete student records
* RESTful API design
* MySQL database integration
* Layered architecture (Controller → Service → Repository)

## Tech Stack

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* MySQL
* Hibernate
* Maven
* Postman (API testing)

## API Endpoints

### Get All Students

GET /students

### Get Student by ID

GET /students/{id}

### Create Student

POST /students

Example Request:
{
"name": "Harpreet",
"email": "harpreet@test.com",
"course": "Computer Science"
}

### Update Student

PUT /students/{id}

### Delete Student

DELETE /students/{id}

## Project Structure

controller → Handles API requests
service → Contains business logic
repository → Database operations using JPA
entity → Student entity mapped to MySQL table

## Run Locally

1. Clone the repository
   git clone https://github.com/yourusername/student-management-api.git

2. Navigate to project folder
   cd student-management-api

3. Configure MySQL database in application.properties

4. Run the application
   mvn spring-boot:run

Server will start at:
http://localhost:8080
