# 06 Recursion

This is the most important module in the language half of this repository.

Merge sort, quicksort, every tree traversal, backtracking and dynamic programming are all
recursion wearing different clothes. If recursion is still uncomfortable when you reach the data
structures phase, you will be fighting two unfamiliar things at once. Do not move on early.

## Learning Goals

By the end of this module, you should be able to:
- Identify the base case and the recursive case of a problem.
- Explain what the call stack holds during a recursive call.
- Convert a simple recursion into a loop, and a simple loop into a recursion.
- Recognize when recursion recomputes the same work and what to do about it.
- Read a recursive function and predict its output without running it.

## What This Module Should Contain

Write these yourself, in this order. The order is deliberate: each one adds exactly one idea.

- `Countdown.java` - the simplest possible recursion, to see the base case
- `Factorial.java` - a single recursive call returning a value
- `SumOfDigits.java` - reducing the input rather than counting down
- `Fibonacci.java` - two recursive calls, and your first exponential blowup
- `FibonacciMemo.java` - the same function with a cache, for the contrast
- `ReverseString.java` - recursion on something that is not a number
- `BinarySearchRecursive.java` - recursion that halves the input
- `TowersOfHanoi.java` - recursion that produces a sequence of moves
- `Permutations.java` - your first backtracking, choose / explore / un-choose

## Core Concepts

### Base Case and Recursive Case

Every recursive method needs two things:

- A **base case** that returns without recursing.
- A **recursive case** that calls itself with an input strictly closer to the base case.

"Strictly closer" is what guarantees termination. If the input does not shrink, you get
`StackOverflowError`.

### The Call Stack

Each call gets its own copy of the parameters and local variables. Nothing is shared unless you
pass a reference. Understanding this is what makes backtracking make sense later.

Draw the stack by hand for `factorial(4)`. All four frames, then the unwinding. Do it on paper
once and you will never be confused by recursion depth again.

### Two Directions of Work

Work can happen **before** the recursive call or **after** it:

```java
void down(int n) { if (n == 0) return; print(n); down(n - 1); }  // prints 3 2 1
void up(int n)   { if (n == 0) return; up(n - 1); print(n); }    // prints 1 2 3
```

Same structure, opposite output. Understanding why is the whole point of this module. This is
also the difference between pre-order and post-order tree traversal.

### Recursion Trees

Draw the call tree for `fib(5)`. Count how many times `fib(2)` is computed. That drawing is your
first encounter with the recursion trees CLRS uses in chapter 4, and with the overlapping
subproblems that dynamic programming exists to fix.

### Recursion vs Iteration

Some recursions are just loops written differently (tail recursion). Some are not: anything that
explores a branching space is far more natural recursive. Learn to tell them apart.

Note that Java does **not** perform tail-call optimization. A tail-recursive method still
consumes one stack frame per call.

## Suggested Practice

1. Write `factorial` recursively, then iteratively. Compare them.
2. Print the numbers 1 to 10 recursively, then print 10 to 1 by moving one line.
3. Time `fib(40)` recursively. Then add a cache and time it again. Explain the difference.
4. Reverse an array in place using recursion with two indices.
5. Compute the sum of an array recursively, passing the index as a parameter.
6. Write a recursion that prints every subset of `{1, 2, 3}`.

## Common Mistakes

- Missing base case, or a base case that is unreachable.
- Input that does not actually get smaller on every call.
- Forgetting to `return` the result of the recursive call.
- Mutating shared state across calls and not undoing it (the bug backtracking is built to avoid).
- Assuming recursion is always slower. It often is not, and clarity matters more here.

## Connection to the Larger Syllabus

This module is the entry point to:
- Divide and conquer (CLRS chapter 4)
- Merge sort and quicksort (CLRS chapters 2 and 7)
- Tree traversals (CLRS chapter 12)
- Backtracking and dynamic programming (CLRS chapters 14-15)

## Next Module

Continue with [07-oop](../07-oop/README.md).
