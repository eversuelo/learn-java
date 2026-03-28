# 07 Reusing Classes: Inheritance, Composition, and Polymorphism

This folder is the natural continuation of object-oriented programming.
It does not yet contain code, but it defines the next set of concepts the repository should teach.

## Learning Goals

By the end of this module, you should be able to:
- Explain inheritance with `extends`.
- Distinguish overriding from overloading.
- Prefer composition when reuse should stay flexible.
- Understand interfaces and polymorphism.

## Topics to Add Here

### Inheritance
Use inheritance when:
- A subclass is a true specialized form of a superclass.

Examples to add:
- `Animal` -> `Dog`
- `Vehicle` -> `Car`

Study points:
- `extends`
- Inherited members
- Method overriding
- Calling `super`

### Composition
Use composition when:
- One class should contain another as a part or helper.

Example idea:
- A `Car` has an `Engine`

Why it matters:
- Composition often leads to more maintainable code than deep inheritance trees.

### Polymorphism
Polymorphism allows one reference type to work with many object implementations.

Example ideas:
- `Shape` interface with `Circle` and `Rectangle`
- `PaymentMethod` interface with `Cash` and `Card`

Study points:
- Upcasting
- Overriding
- Dynamic dispatch
- Interface-driven design

## Recommended Future Files

- `InheritanceExample.java`
- `CompositionExample.java`
- `InterfaceExample.java`
- `AbstractClassExample.java`
- `PolymorphismDemo.java`

## Connection to the Larger Syllabus

This folder is where the following chapters should live:
- Reusing classes via inheritance and composition
- Changing type via polymorphism
- Abstract classes and interfaces
- Covariant return types

## Suggested Practice

1. Create a base `Animal` class and a `Dog` subclass.
2. Override one method in the subclass.
3. Refactor one inheritance example into composition.
4. Create an interface and implement it in two classes.
