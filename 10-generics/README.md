# 10 Generics

This module exists for one reason: without generics you cannot write `Stack<T>`. You would write
a stack of `Object` and cast on every `pop()`, and you would find your mistakes at runtime
instead of at compile time.

Learn generics **before** the data structures phase. Learning them while also fighting linked-list
pointers makes both harder than they need to be.

## Learning Goals

By the end of this module, you should be able to:
- Write a generic class and a generic method.
- Read a signature like `<T extends Comparable<T>>` and say what it constrains.
- Explain type erasure and what it prevents you from doing.
- Use bounded types to write a generic `max` or a generic sort.
- Understand why `List<Object>` is not a supertype of `List<String>`.

## What This Module Should Contain

- `GenericBox.java` - one type parameter, the minimal example
- `GenericPair.java` - two type parameters
- `GenericMethods.java` - a generic method inside a non-generic class
- `BoundedTypes.java` - `<T extends Comparable<T>>` and a generic `max`
- `TypeErasureDemo.java` - what the compiler removes and what breaks as a result
- `Wildcards.java` - `? extends` and `? super`
- `GenericStack.java` - the payoff; this is a first draft of what goes in `dsa-core`

## Core Concepts

### Type Parameters

```java
class Box<T> {
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }
}
```

`T` is a placeholder filled in at the point of use. `Box<String>` and `Box<Integer>` are checked
separately by the compiler. Conventional names: `T` type, `E` element, `K` key, `V` value,
`N` number.

### Generic Methods

The type parameter goes before the return type:

```java
public static <T> void swap(T[] array, int i, int j) { ... }
```

A generic method can live in a non-generic class. The compiler usually infers `T` from the
arguments, so you rarely write it at the call site.

### Bounded Types

`<T>` alone means "any type", so you can only call `Object` methods on it. To compare elements you
have to constrain it:

```java
public static <T extends Comparable<T>> T max(List<T> items) { ... }
```

This is exactly the signature your sorting algorithms will need once they stop working only on
`int[]`. Note that `extends` here covers both classes and interfaces.

### Type Erasure

Generics exist only at compile time. At runtime `List<String>` and `List<Integer>` are the same
class. Consequences you will actually hit:

- You cannot write `new T()`.
- You cannot write `new T[10]`. You will end up with `(T[]) new Object[10]` and a warning. Look at
  how `java.util.ArrayList` handles this internally.
- You cannot use `instanceof List<String>`.
- Two overloads that differ only in type parameter do not compile.

### Invariance and Wildcards

`List<String>` is **not** a subtype of `List<Object>`, even though `String` is a subtype of
`Object`. If it were, you could insert an `Integer` into a `List<String>` through the wider
reference.

Wildcards restore some flexibility:

- `? extends T` - a producer you can read from
- `? super T` - a consumer you can write to

The mnemonic is PECS: Producer Extends, Consumer Super.

## Suggested Practice

1. Write `Box<T>` and use it with three different types.
2. Write a generic `swap` for arrays.
3. Write a generic `max` that works on any `Comparable`.
4. Write `Pair<K, V>` with a `swap()` that returns `Pair<V, K>`.
5. Try `new T[10]` and read the compiler error carefully. Then work around it.
6. Write `GenericStack<T>` backed by an array, with `push`, `pop`, `peek`, `isEmpty`. Throw a
   sensible exception on underflow, using what you learned in
   [09-exceptions](../09-exceptions/README.md).

Exercise 6 is the bridge into the data structures phase. Keep it.

## Common Mistakes

- Using raw types (`List` instead of `List<String>`) and losing all type checking.
- Expecting `T` to be known at runtime.
- Assuming `List<Dog>` can be passed where `List<Animal>` is expected.
- Reaching for wildcards before you actually need them. Start simple.

## Connection to the Larger Syllabus

Everything in `dsa-core/` depends on this module. `LinkedList<T>`, `Stack<T>`, `Queue<T>`,
`BinaryTree<T>` and the comparator-based sorts are all unwritable without it.

## Next Module

Continue with [11-collections](../11-collections/README.md), where you will see how the standard
library applies all of this.
