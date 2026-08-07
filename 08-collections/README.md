# 08 Collections

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

## Connection to Existing Repository Content

This repository already includes related material under:
- [algorithms-data-structures/04-data-structures](../algorithms-data-structures/04-data-structures)

That content should eventually be connected to concrete Java collection examples in this folder.

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
