# Java Curriculum Guide

This document reorganizes the larger Java syllabus into a practical study plan that matches the current repository.

It covers the **language** only. For the full sequence - including the algorithms phase, the
CLRS analysis track, and the JavaFX visualizer - see [STUDY-PLAN.md](STUDY-PLAN.md).

## Part I. Core Language Foundations

### Chapter 1. Getting Started with Java
- What Java is.
- The JVM, JDK, and JRE.
- The `main` method.
- Compiling and running Java code.
- Your first console program.

Repository anchor:
- [01-fundamentals](01-fundamentals/README.md)

### Chapter 2. Comments, Identifiers, Types, Variables, and Literals
- Single-line comments, block comments, and Javadoc.
- Naming rules and conventions.
- Primitive types versus reference types.
- Declaring variables and assigning values.
- Reading literals in source code.

Repository anchor:
- [01-fundamentals](01-fundamentals/README.md)

### Chapter 3. Expressions and Operators
- Arithmetic operators.
- Comparison operators.
- Logical operators.
- Assignment and compound assignment.
- Operator precedence and readability.

Repository anchor:
- [02-control-flow](02-control-flow/README.md)

### Chapter 4. Statements and Decision-Making
- Expression statements.
- Variable declarations.
- `if`, `if-else`, and `switch`.
- `return`, `break`, and `continue`.

Repository anchor:
- [02-control-flow](02-control-flow/README.md)

### Chapter 5. Loops
- `for`
- `while`
- `do-while`
- `for-each`
- Selecting the right loop for the problem

Repository anchor:
- [03-loops](03-loops/README.md)

### Chapter 6. Arrays
- Array declaration and initialization.
- Reading and writing elements.
- Traversal patterns.
- Searching and sorting basics.
- 2D arrays and matrix thinking.

Repository anchor:
- [04-arrays](04-arrays/README.md)

### Chapter 7. Methods
- Defining methods.
- Parameters and arguments.
- Return values.
- Scope and lifetime of variables.
- Decomposition and reuse.

Repository anchor:
- [05-functions](05-functions/README.md)

### Chapter 7b. Recursion
- Base case and recursive case.
- The call stack.
- Work before versus after the recursive call.
- Recursion trees and repeated subproblems.
- When recursion is clearer than iteration, and when it is not.

Repository anchor:
- [06-recursion](06-recursion/README.md)

This chapter is not in the original syllabus, and it is the most important addition to it.
Every divide-and-conquer algorithm, every tree traversal, and all of backtracking and dynamic
programming depend on it.

## Part II. Object-Oriented Java

### Chapter 8. Classes and Objects
- Class declarations.
- Fields and methods.
- Constructors.
- Instance creation and state.
- Encapsulation basics.

Repository anchor:
- [07-oop](07-oop/README.md)

### Chapter 9. Inheritance and Composition
- `extends`
- Reuse through specialization.
- Reuse through composition.
- Why composition is often safer than deep inheritance.

Repository anchor:
- [08-oop-extending](08-oop-extending/README.md)

### Chapter 10. Polymorphism and Interfaces
- Upcasting.
- Method overriding.
- Abstract classes.
- Interfaces and contracts.
- Designing to behavior, not concrete type.

Repository anchor:
- [08-oop-extending](08-oop-extending/README.md)

### Chapter 11. Nested Classes and Packages
- Static nested classes.
- Inner classes.
- Local and anonymous classes.
- Packages and imports.
- Organizing larger projects.

Repository anchors:
- [08-oop-extending](08-oop-extending/README.md)
- [dsa-core](dsa-core/README.md)

Packages stop being theoretical in `dsa-core`, which is the first part of this repository
organized as a real multi-package project rather than as loose files.

### Chapter 11b. Generics
- Type parameters on classes and methods.
- Bounded types, such as `<T extends Comparable<T>>`.
- Type erasure and what it prevents.
- Invariance and wildcards.

Repository anchor:
- [10-generics](10-generics/README.md)

Also not in the original syllabus, and also required. Without generics, every data structure you
write in `dsa-core` would store `Object` and cast on the way out.

## Part III. Standard Library and Robustness

### Chapter 12. Exceptions and Errors
- Checked and unchecked exceptions.
- `try`, `catch`, and `finally`.
- `throw` and `throws`.
- Try-with-resources.

Repository anchor:
- [09-exceptions](09-exceptions/README.md)

### Chapter 13. Math and Numeric Precision
- `Math`
- Random values
- `BigDecimal`
- `BigInteger`
- Why floating-point values need care

Optional side module. Create `12-math/` when you need it. Nothing here blocks the DSA phases,
but `Math` and `Random` show up immediately in the benchmark harness in
[analysis](analysis/README.md), which needs seeded random input.

### Chapter 14. Strings and Text Processing
- String creation and comparison.
- Immutability.
- Useful `String` methods.
- `StringBuilder` and mutable text.

Optional side module. Create `13-strings/` when you need it. Worth doing before the `Trie` and
the string-algorithm sections of the DSA phase.

### Chapter 15. System and Runtime Behavior
- Standard input, output, and error.
- System properties.
- Time measurement.
- Garbage collection basics.

Optional side module. Create `14-system/` when you need it. Time measurement in particular
becomes relevant in [analysis](analysis/README.md) - along with the reasons why wall-clock
timing is a poor primary measurement compared to counting operations.

## Part IV. Data Structures and Problem Solving

### Chapter 16. Collections and Core Data Structures
- Arrays versus lists.
- Stacks, queues, linked lists, and trees.
- When to use each structure.

Repository anchor:
- [11-collections](11-collections/README.md)

### Chapter 17. Complexity Analysis and Recursion
- Big O notation.
- Time versus space tradeoffs.
- Recursive reasoning.

Repository anchor:
- [dsa-core](dsa-core/README.md)
- [analysis](analysis/README.md)

## Study Advice

- Do not treat the examples as code to memorize.
- Treat each file as a concept demonstration.
- After each module, rewrite one example from memory.
- Add a small exercise of your own before moving on.

The strongest way to use this repository is to alternate between reading, running, changing, and explaining the code.
