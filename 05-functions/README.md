# 05 Functions

Java uses methods to package behavior into reusable units.
If variables store data, methods store actions.

## Learning Goals

By the end of this module, you should be able to:
- Declare methods.
- Pass parameters.
- Return values.
- Understand local scope.
- Break large problems into smaller operations.

## Core Concepts

### Method Declaration
A method typically includes:
- Access modifier
- Optional `static`
- Return type
- Method name
- Parameter list
- Method body

Example:

```java
public static int add(int a, int b) {
    return a + b;
}
```

### Parameters and Arguments
- Parameters are variables in the method declaration.
- Arguments are the values passed when the method is called.

### Return Values
Use a return value when:
- The method computes a result that the caller needs.

Use `void` when:
- The method performs an action without returning a value.

### Scope
Important distinction:
- A local variable exists only inside the block where it is declared.
- A method cannot directly use another method's local variables.

### Why Methods Matter
Methods improve:
- Reuse
- Readability
- Testability
- Separation of responsibilities

## Recommended Future Examples

This folder is ready for examples such as:
- `SimpleMethods.java`
- `MethodParameters.java`
- `ReturnValues.java`
- `Calculator.java`
- `ArrayHelper.java`
- `RecursiveExamples.java`

## Suggested Practice

1. Write a method that prints a greeting.
2. Write a method that adds two integers.
3. Write a method that returns the maximum of two numbers.
4. Write a method that counts vowels in a string.
5. Write a recursive factorial method.

## Connection to the Larger Syllabus

This module is the bridge between:
- Core syntax
- Arrays
- Object-oriented programming

If you skip methods, classes will feel harder than they need to be.

## Next Module

Continue with [06-recursion](../06-recursion/README.md).
