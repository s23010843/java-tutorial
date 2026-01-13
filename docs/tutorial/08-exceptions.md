# 8) Exceptions

## Goal

Handle failures correctly: when to throw exceptions, how to catch them, and how to design error messages.

## Checked vs unchecked

- **Unchecked** exceptions: extend `RuntimeException` (common for programming errors).
- **Checked** exceptions: must be declared/handled (common with I/O).

## Throwing exceptions

```java
if (amount <= 0) {
    throw new IllegalArgumentException("amount must be positive");
}
```

## try/catch/finally

```java
try {
    int x = Integer.parseInt("123");
    System.out.println(x);
} catch (NumberFormatException e) {
    System.out.println("Not a number");
} finally {
    // runs even if exception occurs
}
```

## try-with-resources

Use it for resources like files/streams:

```java
try (var reader = Files.newBufferedReader(Path.of("data.txt"))) {
    System.out.println(reader.readLine());
}
```

## Exercises

1. Write a method that parses int from string and returns `OptionalInt` instead of throwing.
2. Create a custom exception `InsufficientFundsException` and use it in `withdraw`.

## Table of contents

1. [Getting Started: Install, run, and your first program](01-getting-started.md)
2. [Java Basics: types, variables, operators, formatting](02-java-basics.md)
3. [Control Flow: if/switch/loops](03-control-flow.md)
4. [Methods: parameters, return values, overloading](04-methods.md)
5. [OOP: classes, objects, encapsulation](05-oop-basics.md)
6. [Inheritance & Polymorphism (and when not to use them)](06-inheritance-polymorphism.md)
7. [Interfaces, abstract classes, and design basics](07-interfaces-abstract.md)
8. [Exceptions and error handling](08-exceptions.md)
9. [Strings, files, and I/O basics](09-strings-io.md)
10. [Collections: List/Set/Map and Big-O intuition](10-collections.md)
11. [Generics (the useful parts)](11-generics.md)
12. [Lambdas & Streams](12-lambdas-streams.md)
13. [Dates and time (java.time)](13-date-time.md)
14. [Testing with JUnit 5 (basics)](14-testing-junit.md)
15. [Concurrency: threads, executors, futures](15-concurrency.md)
16. [JVM basics: memory, GC, performance habits](16-jvm-performance.md)
17. [Build tools: Maven essentials (recommended)](17-maven-essentials.md)
18. [Next steps: projects to build](18-next-steps.md)

