# 06 Object-Oriented Programming

This module introduces one of the central ideas in Java: modeling data and behavior together using classes and objects.

## Learning Goals

By the end of this module, you should be able to:
- Define a class.
- Create objects from that class.
- Distinguish fields from methods.
- Use constructors to initialize state.
- Understand why encapsulation improves design.

## Files in This Module

### `Vehicle.java`
This is the clearest OOP teaching file currently in the repository.

It demonstrates:
- Fields: `make`, `model`, `year`
- Multiple constructors
- Getters and setters
- Creating and mutating an object

What to notice:
- The class models a real-world entity.
- Constructors show method overloading.
- Getters and setters are an early form of encapsulation.

Design note:
- The fields are package-private right now. A stronger design would usually make them `private`.

### `Employee.java`
Use this file as a second object model.

Compare it with `Vehicle.java`:
- What fields does it define
- What behavior belongs to the object
- Whether its design is more data-focused or behavior-focused

### `Main.java`
This file currently demonstrates simple classes and method calls through `A` and `B`.

Pedagogical value:
- It shows that different classes can expose similar method names.
- It can be evolved later into an inheritance or polymorphism example.

## Core Concepts

### Class
A class is a blueprint.
It describes what an object knows and what it can do.

### Object
An object is an instance of a class.
It has its own state in memory.

### Fields
Fields represent state.

Examples:
- A vehicle's make
- A vehicle's model
- A vehicle's year

### Methods
Methods represent behavior.

Examples:
- Getting a field value
- Updating a field value
- Computing a derived value

### Constructors
Constructors are special methods used to initialize objects.

In `Vehicle.java`, multiple constructors show:
- Full initialization
- Partial initialization
- Default initialization

## Suggested Improvements You Can Implement Later

1. Make fields `private`.
2. Add validation in setters.
3. Override `toString()`.
4. Add a `displayInfo()` method.
5. Refactor `Main.java` into a cleaner demonstration of object collaboration.

## Suggested Practice

1. Create a `Book` class with `title`, `author`, and `year`.
2. Add constructors and getters/setters.
3. Create a `Student` class and instantiate two objects.
4. Add a method that prints a formatted summary of the object.

## Connection to the Larger Syllabus

This module maps directly to:
- Declaring classes
- Fields
- Methods
- Constructors
- Constructing objects
- Accessing fields
- Calling methods
- Information hiding
- Object initialization

## Next Module

Continue with [07-oop-extending](/home/eversuelo/Code/Projects/learn-java/07-oop-extending/README.md).
