# Study Plan: From Java Basics to DSA with a JavaFX Sort Analyzer

This is the master document of the repository. It defines **what to study, in what order, and
how to know you are done** with each step.

Everything here is written to be executed by hand. This repository is a workbench, not a
library to install. No algorithm in `dsa-core/` should ever be pasted from a tutorial, from a
book, or from an AI. You type it, you break it, you fix it.

## The Three Sources

Three learning sources are combined here. They do not compete, they answer different questions:

| Source | Question it answers | What you produce |
| --- | --- | --- |
| Hemant Jain, *DSA in Java* | **How** is it implemented? | Working code in `dsa-core/` |
| Cormen (CLRS), *Introduction to Algorithms* | **Why** is it correct and **how much** does it cost? | Proofs and notes in `analysis/notes/` |
| This repository | **Does it actually behave that way?** | Tests, measurements, and the visualizer |

A topic is not finished when the code runs. It is finished when you can implement it, prove it,
and measure it.

## The Learning Loop

Run this loop for every single algorithm and data structure. Do not skip steps, and do not
reorder them. Watching the lecture and reading the chapter on the same day is the point: the
implementation and the analysis reinforce each other.

1. **Watch / read (Jain).** Understand the idea. Then close the video.
2. **Implement from memory.** Write it in `dsa-core/` without looking at the source. If you get
   stuck for more than ~15 minutes, go back, re-read, then close it again and restart from a
   blank file. Restarting from blank is the whole exercise.
3. **Test it.** Write JUnit tests before you trust it: empty input, one element, already sorted,
   reverse sorted, all-duplicates, random arrays compared against `Arrays.sort`.
4. **Analyze (CLRS).** Read the matching chapter. In `analysis/notes/`, write down:
   - the loop invariant, or the recurrence and how you solved it,
   - the best / average / worst case,
   - why the bound is what it is, in your own words.
5. **Measure.** Run the algorithm with a counting tracer over growing input sizes. Export a CSV.
   Compare the measured curve against the theoretical bound. Explain any surprise.
6. **Visualize.** If it is a sorting algorithm, register it in the visualizer.
7. **Log it.** Add an entry in `notes/` using the template.

The rule that makes this work: **you may read any source before writing, and none while writing.**

## The Design That Ties It Together

One decision shapes the whole repository. Sorting algorithms are instrumented through a small
interface so that a single implementation serves testing, analysis, and animation.

```
interface SortTracer
    void compare(int i, int j)
    void swap(int i, int j)
    void set(int i, int value)
    void mark(String label, int... indices)   // pivot, active range, ...
```

Every sort is written as `sort(int[] a, SortTracer t)` and calls the tracer at each observable
step. Then you supply different implementations:

- `NoOpTracer` - does nothing. Used by unit tests. Zero cost.
- `CountingTracer` - counts comparisons and swaps. This is what turns CLRS from abstract theory
  into a measurable curve.
- `RecordingTracer` - appends every step to a list. The JavaFX app replays that list as an
  animation.

Write the tracer once, in Phase 3, before you have five copies of bubble sort scattered around.
Every algorithm you learn afterwards plugs into the benchmark and the visualizer for free.

## Phases

Tick a phase only when every exit criterion is true.

### Phase 0 - Tooling

**Goal:** stop using `javac` by hand for anything that has to be reused.

- [ ] JDK 21 installed and `java --version` confirms it
- [ ] Parent `pom.xml` with modules `dsa-core`, `analysis`, `apps/sort-visualizer`
- [ ] JUnit 5 wired into `dsa-core`
- [ ] One deliberately failing test, then made to pass

The numbered `NN-*` folders stay outside the Maven build on purpose. They are a notebook: single
files you run directly with `java File.java`. Only reusable code lives in `dsa-core/`.

### Phase 1 - Finish the Language

**Goal:** close every gap that would otherwise hurt while writing data structures.

| Module | Status |
| --- | --- |
| [01-fundamentals](01-fundamentals/README.md) | has code |
| [02-control-flow](02-control-flow/README.md) | has code |
| [03-loops](03-loops/README.md) | has code |
| [04-arrays](04-arrays/README.md) | needs work |
| [05-functions](05-functions/README.md) | empty |
| [06-recursion](06-recursion/README.md) | empty |
| [07-oop](07-oop/README.md) | has code |
| [08-oop-extending](08-oop-extending/README.md) | empty |
| [09-exceptions](09-exceptions/README.md) | empty |
| [10-generics](10-generics/README.md) | empty |
| [11-collections](11-collections/README.md) | empty |

Two of these are non-negotiable before Phase 5:

- **Recursion** is the bridge to everything. Merge sort, quicksort, trees, backtracking and
  dynamic programming are all recursion wearing different clothes.
- **Generics** is what lets you write `Stack<T>` instead of `Stack` holding `Object`. Learning
  generics while also fighting linked-list pointers doubles the difficulty of both.

- [ ] Every module above has runnable examples you wrote
- [ ] You can explain each module out loud without notes

### Phase 2 - Analysis Foundations

**Goal:** be able to say *why* a bound holds, not just quote it.

- Jain: introduction, complexity analysis
- CLRS: chapters 1-3 (4th ed.) - the role of algorithms, insertion sort, loop invariants,
  asymptotic notation

Apply it immediately to code you already wrote: the insertion sort from `04-arrays`.

- [ ] Loop invariant for insertion sort written out: initialization, maintenance, termination
- [ ] You can define O, Omega and Theta precisely and say why they are different
- [ ] Notes in `analysis/notes/`

### Phase 3 - Divide and Conquer

**Goal:** recurrences, and the tracer infrastructure.

- Jain: sorting part I
- CLRS: chapter 4 (divide-and-conquer, substitution, recursion trees, master theorem),
  chapter 5 for a first look at randomization

- [ ] `SortTracer` and the three implementations exist in `dsa-core/`
- [ ] Merge sort and quicksort implemented from memory and tested
- [ ] `T(n) = 2T(n/2) + Theta(n)` solved by hand three ways: substitution, recursion tree, master
- [ ] Explain why quicksort degrades to Theta(n^2) and what randomized pivots buy you

### Phase 4 - The Visualizer (v1)

**Goal:** see it. This is deliberately early, not saved for the end.

- Jain: sorting part II
- CLRS: chapters 7-8 (quicksort, sorting in linear time, and the Omega(n log n) lower bound)

By now you have bubble, selection, insertion, merge and quicksort. That is enough material for
something worth showing, and from here every new algorithm plugs in for free. Details in
[apps/sort-visualizer/README.md](apps/sort-visualizer/README.md).

- [ ] JavaFX window renders an array as bars on a `Canvas`
- [ ] A recorded trace replays as an animation
- [ ] Benchmark harness produces a CSV of comparisons and swaps vs. input size
- [ ] Measured curves match the theoretical bounds, and you can explain the deviations

### Phase 5 - Linear Structures

- Jain: linked list, stack, queue
- CLRS: chapter 10

- [ ] Singly and doubly linked lists, generic, implemented from scratch
- [ ] Stack and queue, both array-backed and list-backed
- [ ] You can state the cost of every operation in each backing, and why they differ

### Phase 6 - Trees, Heaps, Hashing

- Jain: heap, hash table, tree
- CLRS: chapters 6, 11, 12, 13

- [ ] Binary heap, plus heapsort added to the visualizer
- [ ] Hash table with collision handling you implemented yourself
- [ ] BST with insert, search, delete and all four traversals
- [ ] You can explain why a balanced tree is needed and what rotations do

### Phase 7 - Graphs

- Jain: graphs
- CLRS: chapters 20-24 (4th ed.) / 22-25 (3rd ed.)

- [ ] Both adjacency-list and adjacency-matrix representations
- [ ] BFS, DFS, topological sort
- [ ] MST (Kruskal or Prim) and Dijkstra
- [ ] You can explain why Dijkstra breaks on negative edges

### Phase 8 - Design Techniques

- Jain: algorithm design techniques
- CLRS: chapters 14-15 (4th ed.) / 15-16 (3rd ed.)

- [ ] Greedy, with one case where greedy is provably optimal and one where it fails
- [ ] Dynamic programming, both memoized and bottom-up
- [ ] Backtracking (n-queens, subsets, permutations)
- [ ] You can identify optimal substructure and overlapping subproblems in a new problem

## Target Repository Structure

```
learn-java/
  STUDY-PLAN.md          this file
  CURRICULUM.md          language syllabus reference
  Projects.md            long-term project ideas
  notes/                 learning log, one file per topic
  01-fundamentals/ .. 11-collections/     the notebook: plain files, run with java File.java
  dsa-core/              the real library: packages, generics, JUnit tests
  analysis/              CLRS notes, exercises, and the measurement harness
  apps/sort-visualizer/  JavaFX application, depends on dsa-core
```

The split matters. Notebook files are throwaway experiments and stay messy on purpose. Anything
the visualizer imports has to be a proper, tested, packaged library.

## Rules for Manual Learning

These are the rules that make the difference between finishing the material and learning it.

1. **Never copy-paste code into this repository.** Typing it is part of the encoding.
2. **Implement from a blank file.** Reading an implementation and re-typing it teaches almost
   nothing. Read, close, then write.
3. **Test before you trust.** An algorithm that has not been run against an edge case is a guess.
4. **Trace by hand at least once per algorithm.** Take an eight-element array and step through it
   on paper. When your hand-trace and the visualizer disagree, one of them taught you something.
5. **Write the analysis in your own words.** Copying a proof from CLRS is not studying CLRS.
6. **Re-implement anything you cannot rebuild a week later.** Spaced repetition applies to code.
7. **Commit small and often.** One commit per algorithm, with the test in the same commit.

## Progress Tracking

Keep a running log in `notes/`. One file per algorithm or data structure, created from
`notes/_TEMPLATE.md`. The log is not a summary of the source material. It is a record of what
confused you, what you got wrong, and what finally made it click. That is the part you cannot
look up later.
