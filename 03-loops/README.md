# 03 Loops

This module introduces repetition in Java.
Loops are essential because they let a program perform work multiple times without duplicating code.

## Learning Goals

By the end of this module, you should be able to:
- Use `for` when the number of iterations is known.
- Use `while` when repetition depends on a condition.
- Use `do-while` when the body must run at least once.
- Use `for-each` to traverse arrays and collections more clearly.

## Files

### `ForLoop.java`
Use this example to study:
- Initialization
- Loop condition
- Update expression
- Counter-based repetition

Best use case:
- When you know exactly how many times something should happen.

### `WhileLoop.java`
Use this example to study:
- Condition-first looping
- Repetition controlled by state
- The risk of infinite loops if the condition never changes

Best use case:
- When you do not know the exact number of iterations in advance.

### `DoWhileLoop.java`
Use this example to study:
- Post-condition evaluation
- Why the loop body always executes at least once

Best use case:
- Input validation and menu systems that must prompt at least once.

### `ForEachLoop.java`
Use this example to study:
- Cleaner iteration over sequences
- Read-only traversal patterns
- Reduced boilerplate when you do not need an index

Best use case:
- When the goal is to visit each element, not manage a counter.

## How to Choose the Right Loop

Use `for` when:
- You have a counter.
- You know the bounds.
- Index-based logic matters.

Use `while` when:
- The loop depends on an external condition.
- The number of iterations is not known up front.

Use `do-while` when:
- The action must happen once before validation.

Use `for-each` when:
- You only need each value in a sequence.

## Common Loop Mistakes

- Off-by-one errors.
- Forgetting to update the loop variable.
- Using `<=` when `<` is required.
- Choosing `for-each` when you actually need the index.

## Suggested Practice

1. Modify `ForLoop.java` to count backward from 10 to 1.
2. Change `WhileLoop.java` into a countdown.
3. Build a `do-while` menu that repeats until the user chooses exit.
4. Create an array and print each element with `for-each`.

## How to Run

```bash
cd 03-loops
javac ForLoop.java
java ForLoop
```

## Next Module

After loops, move to [04-arrays](../04-arrays/README.md).
