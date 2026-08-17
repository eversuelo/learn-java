# 11 Collections

Collections are Java's reusable containers for managing groups of objects.
They become essential once arrays start to feel too rigid.

## Learning Goals

By the end of this module, you should be able to:
- Explain why arrays are limited.
- Understand the purpose of `List`, `Set`, `Map`, `Queue`, and `Stack`.
- Choose a collection based on access pattern and constraints.

## What This Module Should Teach

### Lists
Use lists when:
- Order matters.
- Duplicate values are allowed.
- Dynamic resizing is useful.

### Sets
Use sets when:
- Uniqueness matters.
- Fast membership checks are more important than duplicates.

### Maps
Use maps when:
- Data is stored as key-value pairs.

### Queues and Stacks
Use queues when:
- First-in, first-out behavior matters.

Use stacks when:
- Last-in, first-out behavior matters.

## Connection to the Data Structures Phase

This module is the last one in the language notebook, and it is deliberately placed right before
you start writing your own structures in [dsa-core](../dsa-core/README.md).

Study the standard library first, then rebuild it. For each collection you use here, ask what it
must be doing internally, and note the answer. In Phases 5 and 6 you will implement your own
`LinkedList`, `Stack`, `Queue`, `HashTable` and `BinarySearchTree` from scratch, and comparing
your version against the one you used here is a large part of the lesson.

Pay particular attention to which operations are constant time and which are not. `ArrayList`
and `LinkedList` implement the same interface with completely different cost profiles, and
knowing why is the point of the whole exercise.

## Recommended Future Files

- `ArrayListExample.java`
- `HashSetExample.java`
- `HashMapExample.java`
- `QueueExample.java`
- `StackExample.java`

## Suggested Practice

1. Store five names in a list and print them.
2. Use a set to remove duplicates from repeated input.
3. Use a map to associate names with scores.
4. Simulate a queue for customer service.
5. Insert 100000 elements at the front of an `ArrayList` and then of a `LinkedList`. Time both,
   and explain the difference before you look up the answer.

## Next Step

This is the end of the language notebook. Continue with Phase 2 of
[STUDY-PLAN.md](../STUDY-PLAN.md), and start building [dsa-core](../dsa-core/README.md).
