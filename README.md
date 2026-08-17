# Learn Java

This repository is a guided Java learning path built around small, focused examples.
It starts with syntax and core language rules, then moves into control flow, object-oriented programming, data structures, and algorithmic thinking.

The goal of this project is not only to collect `.java` files, but to turn the repository into a study sequence you can follow step by step.

The long-term target is to reach data structures and algorithms and build a **JavaFX sort
analyzer**: an application that animates sorting algorithms and measures what they cost.

> **Start here: [STUDY-PLAN.md](STUDY-PLAN.md).** That document defines the phases, the order, and
> the exit criteria for each step. This README is the map of the language modules only.

## Repository Layout

| Folder | What it is |
| --- | --- |
| `01-*` to `11-*` | The notebook. Single files, run directly, kept intentionally simple. |
| [notes/](notes/README.md) | The learning log. One file per topic. |
| [dsa-core/](dsa-core/README.md) | The real library: packaged, generic, tested. |
| [analysis/](analysis/README.md) | CLRS notes, exercises, and the measurement harness. |
| [apps/sort-visualizer/](apps/sort-visualizer/README.md) | The JavaFX application. |

## Learning Path

### 1. Fundamentals
Start in [01-fundamentals](01-fundamentals/README.md).

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
Continue with [02-control-flow](02-control-flow/README.md).

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
Then study [03-loops](03-loops/README.md).

This module explains:
- Counting loops with `for`.
- Condition-driven loops with `while`.
- Post-check loops with `do-while`.
- Iteration over arrays and collections with `for-each`.

### 4. Arrays and Methods
The folders [04-arrays](04-arrays/README.md) and [05-functions](05-functions/README.md) are prepared as the next natural step in the course.

They document what you should study next:
- One-dimensional and two-dimensional arrays.
- Searching and sorting basics.
- Method declaration, parameters, return values, and scope.

### 5. Recursion
Then work through [06-recursion](06-recursion/README.md).

This is the bridge between the language and the algorithms half of the repository. Merge sort,
quicksort, tree traversals, backtracking and dynamic programming are all recursion in different
clothes. Do not move past this module while it still feels uncomfortable.

### 6. Object-Oriented Programming
Move into [07-oop](07-oop/README.md).

This module introduces:
- Classes and objects.
- Fields and methods.
- Constructors and overloading.
- Encapsulation through getters and setters.

Main examples:
- `Vehicle.java`
- `Employee.java`
- `Main.java`

### 7. Reuse, Robustness, and Abstraction
The remaining language modules close the gaps that would otherwise hurt during the data
structures phase:

- [08-oop-extending](08-oop-extending/README.md) - inheritance, composition, interfaces, polymorphism.
- [09-exceptions](09-exceptions/README.md) - how a structure should fail on an invalid operation.
- [10-generics](10-generics/README.md) - required before you can write `Stack<T>`.
- [11-collections](11-collections/README.md) - the standard library, studied before you rebuild it.

### 8. Data Structures and Algorithms
From here the work moves out of the notebook and into real, tested code:

- [dsa-core](dsa-core/README.md) - the structures and algorithms you implement yourself.
- [analysis](analysis/README.md) - the CLRS side: proofs, recurrences, and measurements.
- [apps/sort-visualizer](apps/sort-visualizer/README.md) - the JavaFX sort analyzer.

The phase order, the source mapping, and the exit criteria are all in
[STUDY-PLAN.md](STUDY-PLAN.md).

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

Everything here is meant to be written by hand. Nothing in this repository should be pasted from
a tutorial, a book, or an AI. The rules that keep this honest are in
[STUDY-PLAN.md](STUDY-PLAN.md#rules-for-manual-learning); the short version is: read the source,
close it, then write from a blank file.

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

Since JDK 11 you can also skip the compile step for a single file:

```bash
java HelloWorld.java
```

That is the fastest way to work in the notebook folders. Code in `dsa-core/`, `analysis/` and
`apps/` is built with Maven instead, because it has dependencies and tests.

## Recommended JDK

**JDK 21.** It is a long-term-support release, it is what the JavaFX visualizer targets, and it
is widely documented. JDK 17 also works for everything in the notebook folders.

## Repository Notes

- Some modules already contain runnable examples.
- Some modules are currently documentation-first and are ready for new exercises.
- The repository is intentionally incremental: small examples first, deeper abstraction later.

## Next Step

Read [STUDY-PLAN.md](STUDY-PLAN.md) first, so you know where the sequence is going and why.

Then start with [01-fundamentals](01-fundamentals/README.md), run every file, and write one
variation of each example before moving on.
