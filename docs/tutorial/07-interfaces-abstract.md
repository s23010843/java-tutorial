# 7) Interfaces & Abstract Classes

## Goal

Use interfaces for capabilities and abstraction; understand abstract classes and when they fit.

## Interfaces

```java
interface Payable {
    long calculatePayCents();
}

class Contractor implements Payable {
    private final long hourlyRateCents;
    private final int hours;

    Contractor(long hourlyRateCents, int hours) {
        this.hourlyRateCents = hourlyRateCents;
        this.hours = hours;
    }

    public long calculatePayCents() {
        return hourlyRateCents * hours;
    }
}
```

## Abstract classes

Use when you want shared code + some required methods:

```java
abstract class Employee {
    protected final String name;

    protected Employee(String name) {
        this.name = name;
    }

    abstract long calculatePayCents();
}
```

## Practical guideline

- Use **interfaces** for public APIs and "capabilities".
- Use **abstract classes** for shared implementation inside a family of classes.

## Exercises

1. Create `Storage` interface with methods `save(String key, String value)` and `load(String key)`.
2. Implement it with an in-memory `MapStorage`.

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

