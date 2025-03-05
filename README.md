# Student Management System 

## Overview
This is a simple **Student Management System** built in **Java**, allowing users to:
- Add new students
- Display all students
- Search students by PRN, Name, or Position
- Update student details
- Delete students

The system uses **ArrayList** for storing student records and provides a **menu-driven interface** for easy interaction.

---
## Files and Structure

The project contains three main Java files:

1. **Main.java**  
   - Contains the main execution logic and user menu.
   - Calls various functions from `StudentOperator` for performing CRUD operations.

2. **Student.java**  
   - Defines the `Student` class with attributes:
     - `name`, `prn`, `branch`, `batch`, `cgpa`
   - Provides **getter, setter, and display methods**.

3. **StudentOperator.java**  
   - Implements `StudentOperator` class to handle student-related operations.
   - Supports adding, searching, updating, and deleting students.


## Methods or function
The project contains three main Java files:

1. **addStudent**  
   - Adds a student to the list.

2. **displayStudent**  
   - Displays all students stored in the list.

3. **searchByPRN**  
   - Finds a student by PRN and returns the Student object.
  
4. **searchByName**  
   - Finds a student by Name.

5. **searchByPosition**  
   - Finds a student at a given index in the list.
  
6. **updateStudent**  
   - Updates a student's details if PRN exists.

7. **deleteStudent**  
   - Deletes a student by PRN.

## By:
## Name: Yashwith Behara
