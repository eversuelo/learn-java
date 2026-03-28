# 02 Control Flow

This module teaches Java decision-making.
Once you can declare variables and read values, the next step is controlling what the program does based on conditions.

## Learning Goals

By the end of this module, you should be able to:
- Compare values with relational operators.
- Combine conditions with logical operators.
- Write `if`, `else if`, and `else` branches.
- Use `switch` when one value leads to several fixed outcomes.

## Files in This Module

### `ComparisionOperators.java`
Focuses on relational comparisons.

Key ideas:
- Equality and inequality
- Greater than and less than
- Expressions that evaluate to `boolean`

Important note:
- The file name uses `Comparision`, but the conventional spelling is `Comparison`.

### `LogicOperators.java`
Introduces logical composition.

Key ideas:
- `&&` for logical AND
- `||` for logical OR
- `!` for logical NOT
- Combining simple conditions into more expressive rules

### `ControlFlowIf.java`
Shows branching with `if`, `else if`, and `else`.

What is especially useful here:
- Input is read with `Scanner`
- A value is checked against a target
- Different branches produce different outputs
- The example uses `try-with-resources`, which is good practice

### `ControlFlowSwitch.java`
Demonstrates `switch`.

Use it for:
- Menus
- Fixed option sets
- Clear multi-branch logic when a single value determines the path

## Decision-Making Patterns

### Use `if`
Choose `if` when:
- The logic is based on ranges.
- Conditions are complex.
- Several related checks depend on boolean expressions.

### Use `switch`
Choose `switch` when:
- One expression determines the result.
- Cases are discrete and readable.
- You want a cleaner alternative to long equality chains.

## Common Logic Errors

- Writing `=` instead of `==`.
- Building conditions that can never be true.
- Using overly complex boolean expressions without parentheses.
- Forgetting that `switch` is best for fixed-value branching, not all decision logic.

## Suggested Practice

1. Edit `ControlFlowIf.java` so the number is compared against `10` instead of `8`.
2. Write a grading program that prints `A`, `B`, `C`, `D`, or `F`.
3. Write a small menu using `switch` with at least four options.
4. Combine two conditions using `&&` and two more using `||`.

## How to Run

```bash
cd 02-control-flow
javac ControlFlowIf.java
java ControlFlowIf
```

## Next Module

After this folder, continue to [03-loops](/home/eversuelo/Code/Projects/learn-java/03-loops/README.md).
