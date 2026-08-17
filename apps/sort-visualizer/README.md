# Sort Visualizer

A JavaFX application that animates sorting algorithms and reports what they cost.

This is the goal project of the repository. It is scheduled in **Phase 4**, not at the end, for
two reasons: by then you will have five algorithms worth showing, and from that point on every new
algorithm you learn appears here for free. A project saved for the end is a project that does not
get built.

## Design Constraint

The visualizer must contain **no algorithm logic**. It knows nothing about quicksort. It receives
a list of steps from `dsa-core` and draws them.

If you ever find yourself writing a comparison or a swap inside this module, the tracer design
has broken down. Go fix `dsa-core` instead.

## Architecture

```
dsa-core                  apps/sort-visualizer
  sorting.QuickSort  -->  RecordingTracer  -->  List<Step>  -->  Renderer (Canvas)
                          CountingTracer   -->  counters   -->  Metrics panel
```

### Record and replay, not live threading

For v1, run the sort to completion first, collect every step into a list, then animate the list.

This is much simpler than the alternative and it gives you scrubbing, stepping backwards and
pausing almost for free. The alternative - running the sort on a background thread that emits into
a `BlockingQueue` while the UI drains it - is more elegant but drags concurrency into a project
that does not need it yet. Leave that for later, if ever.

Be aware of the memory: sorting 1000 elements with bubble sort records on the order of a million
steps. Keep the array small (under ~200 elements) for animation, and keep the large runs for the
benchmark harness in `analysis/`, which does not record anything.

### Rendering

Use a **`Canvas` with a `GraphicsContext`**, not one `Rectangle` node per bar. The scene graph
struggles once you have a few hundred nodes changing every frame; a canvas redraw of a few hundred
filled rectangles is trivial.

Drive the loop with `AnimationTimer`, which fires once per rendered frame. Decouple animation
speed from frame rate by consuming N steps per frame rather than one, so the speed slider does not
have to change the frame rate.

Colour is what carries the meaning. Give distinct colours to the elements being compared, the
elements being swapped, the pivot or active range, and the region already in final position.
Without that, every algorithm looks like the same jittering bars.

## Roadmap

### v1 - It moves

- [ ] JavaFX window opens with a `Canvas`
- [ ] An array of random integers renders as vertical bars
- [ ] A recorded trace from one algorithm replays as an animation
- [ ] Compared elements are highlighted in a different colour

Stop here and commit. This is the milestone that makes the whole plan feel real.

### v2 - It is usable

- [ ] Algorithm selector
- [ ] Play, pause, step forward, step backward, reset
- [ ] Speed slider
- [ ] Array size slider
- [ ] Input shape selector: random, sorted, reversed, nearly sorted, few unique

The input shape selector is the feature that teaches the most. Watching insertion sort finish
almost instantly on nearly-sorted input, right after watching it crawl on random input, makes
best-case versus worst-case analysis concrete in a way the formula does not.

### v3 - It analyzes

This is the step that turns a visualizer into the *analyzer* the plan is named after.

- [ ] Live counters: comparisons, swaps, array accesses
- [ ] Elapsed steps against the theoretical bound for the current `n`
- [ ] A chart of measured operations vs `n`, overlaid with `n^2` and `n log n` reference curves
- [ ] Load the CSV produced by the `analysis` harness and plot it

### v4 - It compares

- [ ] Two algorithms side by side on identical input, running in lockstep
- [ ] A summary table of all algorithms on the current input shape

## Setup Notes

You are doing this setup yourself. A few things worth knowing before you start, because they are
the parts people lose an afternoon to:

- JavaFX has not shipped with the JDK since Java 11. You add it as a dependency
  (`org.openjfx:javafx-controls`) and run through `javafx-maven-plugin`. Alternatively use a JDK
  build that bundles JavaFX, such as Liberica Full or Azul Zulu FX, which avoids the module path
  entirely and is a legitimate shortcut while learning.
- The JavaFX version should match your JDK's major version where possible.
- The classic first error is `Error: JavaFX runtime components are missing`. It means the modules
  are not on the module path. Running through the Maven plugin rather than a bare `java` command
  is the usual fix.
- **All UI updates must happen on the JavaFX Application Thread.** If you later move the sort onto
  a background thread, every UI change has to go through `Platform.runLater`.

## Extension Ideas

Once v4 works, if you want to keep going:

- Sound: map bar height to pitch on each access. It is a known trick and it is genuinely fun.
- Export the animation as a GIF or video.
- Visualize non-sorting algorithms with the same step model: BFS and DFS on a graph, or BST
  insertions and rotations. The tracer abstraction generalizes further than sorting, and adapting
  it is a good exercise in interface design.
