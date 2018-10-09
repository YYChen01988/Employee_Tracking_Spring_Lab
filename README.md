# Employee_Tracking_Spring_Lab

Lab: Bootstrap an Employee tracking application
Lab Duration: 45-60 minutes

### Learning Objectives
Consolidate how to bootstrap a new Spring Application
Be able to annotate a class for persistence to the database
Be able to create a repository for doing database operations
Be able to inject the repository into the controller
Brief
In this lab please use what you've already learned about Spring to create an entirely new Spring application that allows you to get the details of an employee.

Start from scratch using the Spring Boot Initializr (https://start.spring.io/).

### MVP
Create a Spring Boot application for recording employee data that has:

An Employee class that conforms to POJO and is annotated with fields name, age, employeeNumber and email.
A repostory for doing database operations
A RestController with one route for getting a JSON list of all Employees.
Planning
Make a list/diagram of the files that will make up your program and note down their responsibilities.


# Lab: One To Many and Many to Many
# Lab Duration: 90 minutes

### Learning Objectives
Understand the relationships, one to many and many to many.
Be able to implement one-to-many and many-to-many relationships between models with Spring JPA + Hibernate
Introduction
In this lab, use what you've learned about one-to-many and many-to-many to create an application for a company to track their employees, departments and projects.

### Task
### MVP
A Department must have one-to-many with Employee: A Department has many Employees. An Employee must have a many-to-many with a Project: An Employee can be part of many Projects and a Project can have many different Employees in it.

Implement the following models to achieve the above relationships:

### An Employee must:

have a first name
have last name
have an employee number
be able to be assigned to multiple projects

### A Department must:

have a name
be able to add multiple employees

### A Project must

have a name
have a duration in number of days
be able to add multiple employees

### Extension
Create the index routes for Employee, Department and Project

Planning
Draw a diagram modelling the relationships between the models. Study the previous two lessons on one-to-many and many-to-many to help you.

This lab requires two relationships to be setup, it's a good idea to complete one relationship at a time.

Remember to create a JpaRepository for each model.
