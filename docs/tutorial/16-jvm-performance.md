# 16) JVM Basics: Memory, GC, Performance Habits

## Goal

Build correct mental models for performance without premature optimization.

## JVM memory (high level)

- Heap: where objects live
- Stack: method frames, local variables

## Garbage collection

- You usually don’t free memory manually.
- Avoid holding references longer than needed.

## Practical performance habits

- Prefer clarity first.
- Measure before optimizing.
- Avoid unnecessary allocations in hot loops.
- Use the right data structure.

## Exercises

1. Use `System.nanoTime()` to compare two string-building approaches: `+` in a loop vs `StringBuilder`.
2. Read about GC logs (optional): run Java with GC logging flags (varies by version).
