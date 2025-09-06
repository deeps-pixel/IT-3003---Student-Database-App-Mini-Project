# IT-3003---Student-Database-App-Mini-Project
# Student Database App
A Java console application that connects to a MySQL database using JDBC. It allows users to add, view, update, and delete student records.
---

## Setup Instructions

### 1. Install MySQL and MySQL Workbench
- Follow [this installation guide](https://www.youtube.com/watch?v=u96rVINbAUI) to set up MySQL Server and Workbench on Windows.

### 2. Create the Database and Table
Open MySQL Workbench and run:

```sql
CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age INT
);
