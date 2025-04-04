# School Management System

This project demonstrates a school management system implementing Object-Oriented Programming principles, particularly inheritance and polymorphism.

## Inheritance Implementation

The project uses multiple levels of inheritance:

1. Base Class Hierarchy:
   - `Person`: Base class for all individuals in the system
     - `AcademicMember`: Abstract class extending Person
       - `Lecturer`: Extends AcademicMember
     - `Student`: Extends Person
       - `GraduateStudent`: Extends Student

2. Inheritance Benefits:
   - Code reuse: Common attributes (id, name, email, phone) are inherited from Person
   - Extensibility: New types of students or academic members can be added easily
   - Hierarchical organization: Represents real-world relationships between entities

## Polymorphism Implementation

The project demonstrates both types of polymorphism:

1. Method Overriding (Runtime Polymorphism):
   - `AcademicMember` defines abstract methods:
     - `printSchedule()`
     - `calculateWorkload()`
   - These methods are implemented differently in `Lecturer`
   - `GraduateStudent` overrides `printCourseDetails()` to include research information

2. Method Overloading (Compile-time Polymorphism):
   - Various constructor overloads
   - Different versions of print methods for different types of data

## Class Responsibilities

- `Person`: Base class with common attributes
- `AcademicMember`: Abstract class for academic staff
- `Lecturer`: Manages course assignments and teaching responsibilities
- `Student`: Handles course enrollment and grades
- `GraduateStudent`: Extends Student with research-related functionality
- `Course`: Manages course information and student enrollment
- `Programme`: Handles program structure and course organization

## Benefits of This Design

1. Extensibility: New types of students or staff can be added without modifying existing code
2. Maintainability: Common code is centralized in parent classes
3. Flexibility: Polymorphic behavior allows for different implementations of common methods
4. Type Safety: Inheritance hierarchy ensures proper type relationships