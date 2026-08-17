# analysis

This is the CLRS half of the repository: the proofs, the recurrences, and the measurements that
confirm them.

The purpose of this folder is to stop asymptotic notation from being something you recite. A
bound you have derived and then measured is a bound you understand.

## Layout

```
analysis/
  notes/        one file per CLRS chapter or topic
  exercises/    selected book exercises, worked by hand
  src/main/java/bench/    the measurement harness
  results/      generated CSV files (git-ignored)
```

## The Rule

Write the analysis in your own words. Copying a proof out of CLRS is not studying CLRS. If you
cannot restate the argument without the book open, you have not finished the section.

## Chapter Map

Chapter numbers are for the **4th edition**. The 3rd edition equivalents are noted where they
differ.

| Phase | Topic | CLRS 4th ed. | 3rd ed. |
| --- | --- | --- | --- |
| 2 | Role of algorithms, insertion sort, loop invariants | 1-2 | same |
| 2 | Asymptotic notation | 3 | same |
| 3 | Divide and conquer, recurrences, master theorem | 4 | same |
| 3 | Probabilistic analysis, randomized algorithms | 5 | same |
| 4 | Quicksort | 7 | same |
| 4 | Sorting in linear time, the comparison lower bound | 8 | same |
| 4 | Medians and order statistics | 9 | same |
| 5 | Elementary data structures | 10 | same |
| 6 | Heapsort | 6 | same |
| 6 | Hash tables | 11 | same |
| 6 | Binary search trees | 12 | same |
| 6 | Red-black trees | 13 | same |
| 7 | Elementary graph algorithms | 20 | 22 |
| 7 | Minimum spanning trees | 21 | 23 |
| 7 | Single-source shortest paths | 22 | 24 |
| 7 | All-pairs shortest paths | 23 | 25 |
| 8 | Dynamic programming | 14 | 15 |
| 8 | Greedy algorithms | 15 | 16 |

Chapter 4 is the hardest one in the first half and the one that pays off the most. Do not rush it.

## What Each Note Must Contain

For an **iterative** algorithm, the loop invariant, in three parts:

- **Initialization** - the invariant holds before the first iteration.
- **Maintenance** - if it holds before an iteration, it holds before the next.
- **Termination** - when the loop ends, the invariant gives you the result you wanted.

For a **recursive** algorithm, the recurrence and how you solved it. Solve
`T(n) = 2T(n/2) + Theta(n)` three separate ways - substitution, recursion tree, and the master
theorem - at least once. Seeing the same answer arrive from three directions is what makes the
master theorem stop being magic.

For both: best, average and worst case, and a sentence on what input triggers the worst case.

## The Measurement Harness

Build this in Phase 4, alongside the visualizer. Both consume the same tracer from `dsa-core`.

**What it does:** run each algorithm with a `CountingTracer` over a range of input sizes and input
shapes, and write a CSV.

**Suggested columns:**

```
algorithm,input_shape,n,comparisons,swaps,nanos
```

**Input shapes to measure.** This is where the interesting results are:

- `random`
- `sorted`
- `reverse`
- `nearly_sorted` - random, with about 5% of elements displaced
- `few_unique` - many duplicates

**Sizes:** powers of two from 2^7 to 2^14, several trials per size, and report the median.

**Practical cautions:**

- Use the operation counts as your primary measurement, not the clock. Counts are deterministic
  and reproducible; wall-clock time is polluted by JIT warm-up, GC and cache effects.
- If you do record timings, discard the first few runs as warm-up.
- Use a fixed random seed so your runs are reproducible.

## Questions the Measurements Should Answer

These are the payoff. Each one is a case where the measurement teaches something the formula
alone does not:

- Insertion sort is Theta(n^2), so why does it beat merge sort on `nearly_sorted`?
- Why does insertion sort beat merge sort on small `n` regardless of shape, and roughly where is
  the crossover on your machine?
- What input shape makes naive quicksort degrade to Theta(n^2), and what does randomizing the
  pivot actually do to the measured curve?
- Bubble sort and selection sort are both Theta(n^2). Why do their swap counts differ so much?
- Merge sort and heapsort are both Theta(n log n). Why is heapsort usually slower in practice
  despite doing comparable work?
- Counting sort is Theta(n + k). Find the value of k where it stops being a good idea.

Divide the measured comparison count by the theoretical bound - by `n^2` or `n log n` - and plot
that ratio. If your analysis is right, the ratio flattens to a constant as `n` grows. This is the
single most convincing way to see an asymptotic bound with your own eyes.

## Exercises

Do at least two or three exercises per chapter, by hand, in `exercises/`. Reading a chapter
without doing exercises produces the illusion of understanding. The CLRS exercises are where the
material actually lands.
