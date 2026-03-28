# Learn Java

This repository is a guided Java learning path built around small, focused examples.
It starts with syntax and core language rules, then moves into control flow, object-oriented programming, data structures, and algorithmic thinking.

The goal of this project is not only to collect `.java` files, but to turn the repository into a study sequence you can follow step by step.

## Learning Path

### 1. Fundamentals
Start in [01-fundamentals](/home/eversuelo/Code/Projects/learn-java/01-fundamentals/README.md).

This module introduces:
- Java as a compiled language that runs on the JVM.
- The structure of a Java program.
- Variables, primitive types, and strings.
- Numeric systems and console input.
- Type conversion and parsing.

Main examples:
- `HelloWorld.java`
- `Variables.java`
- `Primitives.java`
- `TypeConversion.java`
- `NumericalSystems.java`
- `NumericalSystemsScannerInput.java`

### 2. Control Flow
Continue with [02-control-flow](/home/eversuelo/Code/Projects/learn-java/02-control-flow/README.md).

This module covers:
- Comparison operators.
- Logical operators.
- `if`, `else if`, and `else`.
- `switch` as a multi-branch decision structure.

Main examples:
- `ComparisionOperators.java`
- `LogicOperators.java`
- `ControlFlowIf.java`
- `ControlFlowSwitch.java`

### 3. Loops
Then study [03-loops](/home/eversuelo/Code/Projects/learn-java/03-loops/README.md).

This module explains:
- Counting loops with `for`.
- Condition-driven loops with `while`.
- Post-check loops with `do-while`.
- Iteration over arrays and collections with `for-each`.

### 4. Arrays and Methods
The folders [04-arrays](/home/eversuelo/Code/Projects/learn-java/04-arrays/README.md) and [05-functions](/home/eversuelo/Code/Projects/learn-java/05-functions/README.md) are prepared as the next natural step in the course.

They document what you should study next:
- One-dimensional and two-dimensional arrays.
- Searching and sorting basics.
- Method declaration, parameters, return values, and scope.

### 5. Object-Oriented Programming
Move into [06-oop](/home/eversuelo/Code/Projects/learn-java/06-oop/README.md).

This module introduces:
- Classes and objects.
- Fields and methods.
- Constructors and overloading.
- Encapsulation through getters and setters.

Main examples:
- `Vehicle.java`
- `Employee.java`
- `Main.java`

### 6. Reuse, Abstraction, and Collections
The next folders prepare the path toward more advanced Java:
- [07-oop-extending](/home/eversuelo/Code/Projects/learn-java/07-oop-extending/README.md)
- [08-collections](/home/eversuelo/Code/Projects/learn-java/08-collections/README.md)
- [algorithms-data-structures](/home/eversuelo/Code/Projects/learn-java/algorithms-data-structures/README.md)
- [applications](/home/eversuelo/Code/Projects/learn-java/applications/README.md)

These sections connect the current repository to topics such as:
- Inheritance and composition.
- Interfaces and polymorphism.
- Collections and abstract data types.
- Complexity analysis and recursive thinking.
- Small real-world Java applications.

## Clean Curriculum Map

The original syllabus you provided is broader than the current codebase. This repository now maps that syllabus into a cleaner progression:

1. Getting Started with Java
2. Comments, identifiers, types, variables, and literals
3. Expressions and operators
4. Statements and control flow
5. Loops
6. Arrays
7. Methods
8. Classes and objects
9. Inheritance, composition, and polymorphism
10. Nested classes, packages, and code organization
11. Exceptions and error handling
12. Math, `BigDecimal`, and `BigInteger`
13. Strings and mutable text handling
14. System utilities, runtime behavior, and standard I/O
15. Data structures, algorithms, and practical applications

Not every chapter above has code yet, but the repository structure now makes the roadmap explicit.

## How to Study This Repository

Use this order:

1. Read the module `README.md`.
2. Run the example files in that folder.
3. Modify the examples and observe the output.
4. Add your own exercise file next to the original example.
5. Move to the next module only after you can explain the previous one in your own words.

## How to Run the Examples

From inside any folder:

```bash
javac FileName.java
java FileName
```

Example:

```bash
cd 01-fundamentals
javac HelloWorld.java
java HelloWorld
```

## Recommended JDK

Any modern JDK is fine for these examples. JDK 17 or JDK 21 is a practical choice for learning because both are widely used and well documented.

## Repository Notes

- Some modules already contain runnable examples.
- Some modules are currently documentation-first and are ready for new exercises.
- The repository is intentionally incremental: small examples first, deeper abstraction later.

## Next Step

Start with [01-fundamentals](/home/eversuelo/Code/Projects/learn-java/01-fundamentals/README.md), run every file, and write one variation of each example before moving on.
