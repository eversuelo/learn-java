# 04 Arrays

This module is the next step after loops because arrays and loops are closely connected.
An array gives you a fixed-size sequence of values, and loops let you process that sequence efficiently.

## Learning Goals

By the end of this module, you should be able to:
- Declare and initialize arrays.
- Access elements by index.
- Traverse arrays with `for` and `for-each`.
- Understand the idea of searching and sorting.
- Read the difference between one-dimensional and two-dimensional arrays.

## What This Module Should Eventually Contain

Recommended future examples:
- `ArrayCreation.java`
- `ArrayTraversal.java`
- `LinearSearch.java`
- `BinarySearch.java`
- `BubbleSort.java`
- `TwoDimensionalArrays.java`
- `MatrixMultiplication.java`

## Core Concepts

### One-Dimensional Arrays
Use a 1D array when:
- You need a fixed-size list of values.
- Every element has the same type.

Example idea:

```java
int[] numbers = {10, 20, 30, 40};
```

### Array Indexing
Important rule:
- Java array indexing starts at `0`.

That means:
- First element: `numbers[0]`
- Second element: `numbers[1]`

### Traversal
Typical patterns:
- Index-based traversal with `for`
- Value-based traversal with `for-each`

### Searching
Study these strategies:
- Linear search for unsorted data
- Binary search for sorted data

### Sorting
Start with simple educational algorithms:
- Bubble sort

Later, compare them with library utilities such as `Arrays.sort`.

### Two-Dimensional Arrays
Use a 2D array when:
- Data is naturally organized into rows and columns.
- You want matrix-style access like `matrix[row][column]`.

## Suggested Practice

1. Create an array of five integers and print them.
2. Compute the sum and average of an array.
3. Find the largest element in an array.
4. Write a linear search that returns whether a number exists.
5. Create a 3x3 matrix and print it row by row.

## Common Mistakes

- Accessing an invalid index.
- Confusing array length with the last valid index.
- Forgetting that arrays have fixed size after creation.

## Connection to the Larger Syllabus

This folder maps to topics such as:
- Introducing arrays
- One-dimensional arrays
- Searching and sorting
- Two-dimensional arrays
- Ragged arrays
- Matrix multiplication

## Next Module

Continue with [05-functions](../05-functions/README.md) to learn how to break logic into reusable methods.
