# dsa-core

The real library. Everything here is packaged, generic where it should be, and covered by tests.

This is the opposite of the numbered `NN-*` notebook folders. Those hold throwaway experiments
run with `java File.java`. Code in `dsa-core` is imported by the benchmark harness and by the
JavaFX visualizer, so it has to be stable.

**Nothing in this folder may be copied from anywhere.** Read, close the source, then write.

## Package Layout

```
dsa-core/src/main/java/dsa/
  trace/        SortTracer and its implementations
  sorting/      Insertion, Selection, Bubble, Merge, Quick, Heap, Counting, Radix
  searching/    LinearSearch, BinarySearch, QuickSelect
  linear/       SinglyLinkedList, DoublyLinkedList, Stack, Queue, Deque
  heap/         BinaryHeap, PriorityQueue
  hash/         HashTable with chaining, HashTable with open addressing
  trees/        BinarySearchTree, AVLTree, Trie
  graph/        AdjacencyList, AdjacencyMatrix, traversals, MST, shortest paths
  design/       greedy, dp, backtracking
dsa-core/src/test/java/dsa/
  (mirror the same structure)
```

## The Tracer

Build this in Phase 3, before you have five sorting algorithms to retrofit.

The problem it solves: you need the same sorting algorithm for three different purposes - unit
tests, operation counting for the CLRS analysis, and step-by-step animation in JavaFX. Without a
tracer you end up with three divergent copies of every algorithm, and they drift apart.

### The interface

```
package dsa.trace;

interface SortTracer
    void compare(int i, int j)
    void swap(int i, int j)
    void set(int i, int value)              // for merge sort, which writes rather than swaps
    void mark(String label, int... indices) // pivot, active range, current minimum
```

### The implementations

| Implementation | Purpose | Cost |
| --- | --- | --- |
| `NoOpTracer` | unit tests, production use | zero, the JIT removes the calls |
| `CountingTracer` | the CLRS measurements | two counters |
| `RecordingTracer` | feeds the visualizer | one object per step |

### The contract every sort follows

```
void sort(int[] a, SortTracer t)
```

with a convenience overload `sort(int[] a)` that passes `NoOpTracer`.

The discipline that makes this work: **every read comparison calls `t.compare`, and every write
calls `t.swap` or `t.set`, with no exceptions.** If you skip one, your operation counts are wrong
and the animation skips a frame. When your hand-trace and the visualizer disagree, this is the
first place to look.

### Why this design

- The counts are exact, not estimated from wall-clock time. Wall-clock time is polluted by JIT
  warm-up, GC and cache effects, and it will not reproduce the clean curves CLRS predicts.
- The visualizer never needs to know anything about any individual algorithm.
- Adding heapsort in Phase 6 costs one line of registration and it appears in both tools.

## Testing Conventions

Write the test before you trust the implementation. Every structure gets at least:

- empty input
- a single element
- two elements, in both orders
- already sorted
- reverse sorted
- all elements equal
- a large random array compared against `Arrays.sort` as the reference

For sorting specifically, also assert that the output is a **permutation** of the input, not just
that it is sorted. A sort that fills the array with zeros is sorted.

For stability, sort objects with a key and a tag, then assert that equal keys kept their original
relative order.

## Order of Implementation

Follow the phases in [../STUDY-PLAN.md](../STUDY-PLAN.md). Summary:

| Phase | Packages |
| --- | --- |
| 3 | `trace`, `sorting` (merge, quick) |
| 4 | `sorting` (the rest), `searching` |
| 5 | `linear` |
| 6 | `heap`, `hash`, `trees` |
| 7 | `graph` |
| 8 | `design` |

## Per-Structure Checklist

Do not consider a structure finished until all of these are true.

- [ ] Implemented from a blank file, without the source open
- [ ] Generic where it makes sense (`<T>` or `<T extends Comparable<T>>`)
- [ ] Every invalid operation throws a documented, sensible exception
- [ ] All edge cases above are tested and green
- [ ] Every public method has a Javadoc line stating its time complexity
- [ ] The matching note in `../notes/` is written
- [ ] The matching analysis note in `../analysis/notes/` is written
- [ ] If it is a sorting algorithm, it is registered in the visualizer

## A Note on int[] vs Generics

The sorts start on `int[]` because the visualizer draws bars of integer height and the tracer
works on indices. That is fine and deliberate.

Once you reach Phase 6, write at least one sort a second time as
`<T> void sort(T[] a, Comparator<T> cmp)`. Doing the same algorithm both ways teaches you more
about generics than the generics module does.
