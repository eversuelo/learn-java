# 09 Exceptions and Error Handling

Up to this module, your programs assumed everything goes well. Real data structures do not have
that luxury: popping an empty stack, indexing past the end of an array, or reading a file that
does not exist all have to be handled deliberately.

## Learning Goals

By the end of this module, you should be able to:
- Distinguish checked from unchecked exceptions and say when each is appropriate.
- Use `try`, `catch`, `finally`, and try-with-resources correctly.
- Throw exceptions from your own code with useful messages.
- Write your own exception type.
- Explain why swallowing an exception silently is worse than crashing.

## What This Module Should Contain

- `TryCatchBasics.java` - catching a division by zero and a bad parse
- `MultipleCatch.java` - several catch blocks, and multi-catch with `|`
- `FinallyBlock.java` - what runs and when, including with an early `return`
- `ThrowAndThrows.java` - raising an exception and declaring it
- `CustomException.java` - your own exception class
- `TryWithResources.java` - automatic closing with `AutoCloseable`
- `StackUnderflowDemo.java` - the case that matters for the DSA phase

## Core Concepts

### Checked vs Unchecked

- **Checked** (`IOException`, `SQLException`): the compiler forces you to handle or declare them.
  They represent conditions a correct program should anticipate.
- **Unchecked** (`RuntimeException` and subclasses): not enforced by the compiler. They usually
  represent programming errors - a null reference, a bad index, an illegal argument.

Rule of thumb for the data structures you are about to write: an empty-stack `pop()` is a
programming error, so `IllegalStateException` or `NoSuchElementException` is the right choice,
not a checked exception. Look at how `java.util.Deque` does it and copy the convention.

### The Exception Hierarchy

```
Throwable
  Error              do not catch these (OutOfMemoryError, StackOverflowError)
  Exception
    RuntimeException unchecked
    everything else  checked
```

You will meet `StackOverflowError` in the recursion module. Note that it is an `Error`, not an
`Exception`, and that this is intentional.

### finally and try-with-resources

`finally` runs whether or not an exception was thrown, including when the `try` block returns.
Try-with-resources is the modern replacement for the common case of closing something, and it
closes resources in reverse order of declaration.

### Failing Well

An exception message should say what went wrong and with what input:

```java
throw new IllegalArgumentException("capacity must be positive, got: " + capacity);
```

An empty `catch` block is almost always a bug. If you genuinely want to ignore an exception, say
so in a comment explaining why.

## Suggested Practice

1. Read an integer from the console and handle a non-numeric input without crashing.
2. Access an array out of bounds on purpose. Read the stack trace top to bottom and explain it.
3. Write a method that throws `IllegalArgumentException` on negative input, and test both paths.
4. Write a `BankAccount` with a custom `InsufficientFundsException`.
5. Write a `try` block containing a `return`, with a `finally` that also prints. Predict the
   output before running it.

## Common Mistakes

- Catching `Exception` when you meant one specific type.
- Empty catch blocks that hide real failures.
- Using exceptions for ordinary control flow.
- Catching an exception you cannot actually do anything about.
- Losing the original cause: pass it along with `throw new MyException("...", cause)`.

## Connection to the Larger Syllabus

This maps to the exceptions and error handling chapter of [CURRICULUM.md](../CURRICULUM.md), and
is a prerequisite for writing the `dsa-core` library, where every structure needs to define its
behavior on invalid operations.

## Next Module

Continue with [10-generics](../10-generics/README.md).
