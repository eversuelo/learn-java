# 01 Fundamentals

This module introduces the syntax and mental model of Java.
If you are new to the language, this is where you should begin.

## Learning Goals

By the end of this module, you should be able to:
- Explain what a Java class is.
- Recognize the purpose of the `main` method.
- Declare variables with primitive and reference types.
- Read and write numeric, character, boolean, and string values.
- Convert values between strings and numeric types.
- Read basic input from the console.

## Files in This Module

### `HelloWorld.java`
Your first executable Java example.

What it demonstrates:
- A class declaration.
- The `public static void main(String[] args)` entry point.
- Printing to standard output.
- A simple `for` loop.

Why it matters:
- It shows that Java programs are structured inside classes.
- It also proves that a "hello world" program can already include logic, not just output.

### `HelloWorldJava.java`
An alternate introductory example.

Use it to compare:
- Class naming.
- Console output style.
- Any differences in formatting or structure.

### `Variables.java`
Introduces variable declaration and primitive data types.

Main ideas:
- `int`, `char`, `float`, `double`, `byte`, and `boolean`
- Storing values in named variables
- Printing values and combining text with variables
- Understanding that `String` is an object, not a primitive

Important note:
- Java is statically typed, so every variable has a declared type.

### `Primitives.java`
### `PrimitivesBoolean.java`
### `PrimitivesCharacters.java`
### `PrimitivesFloat.java`
### `PrimitivesIntegers.java`
These files break primitive types into smaller examples.

Use them to study:
- Range and precision
- Literal syntax
- Type-specific behavior
- Safe and unsafe assumptions about numeric values

### `TypeConversion.java`
Shows how to convert between strings and numbers.

Main ideas:
- Parsing a `String` into `int`, `double`, and `boolean`
- Converting numeric values back to `String`
- Explicit casting
- Data loss during narrowing conversions

Why it matters:
- Type conversion is one of the first places where beginners see the difference between valid syntax and correct logic.

### `NumericalSystems.java`
Introduces number representations.

Study focus:
- Decimal, binary, and possibly hexadecimal thinking
- How the same value can be represented in different bases

### `NumericalSystemsScannerInput.java`
Combines numeric concepts with console input.

Study focus:
- Reading from the keyboard
- Using `Scanner`
- Translating user input into typed Java values

## Key Concepts

### Java Program Structure
A minimal Java program usually contains:
- A class
- A `main` method
- Statements inside the method

### Primitive Types
The main primitive types you should know early are:
- `byte`
- `short`
- `int`
- `long`
- `float`
- `double`
- `char`
- `boolean`

### Reference Types
In this module, the most common reference type is:
- `String`

Reference types differ from primitive types because they refer to objects rather than storing the value directly in the same way.

## Suggested Practice

1. Run every file in this folder.
2. Change one literal value in each example and predict the output before executing it.
3. Add one new variable of your own to `Variables.java`.
4. Add one more conversion example to `TypeConversion.java`.
5. Create `MyFirstProgram.java` and print your name, age, and favorite number.

## Common Beginner Mistakes

- Forgetting semicolons.
- Using the wrong class name when running `java`.
- Forgetting that Java is case-sensitive.
- Confusing `=` with `==`.
- Assuming `String` is a primitive type.
- Ignoring possible data loss during casting.

## How to Run

```bash
cd 01-fundamentals
javac Variables.java
java Variables
```

## Next Module

After this folder, continue to [02-control-flow](../02-control-flow/README.md).
