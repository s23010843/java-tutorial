# 5) OOP Basics: Classes, Objects, Encapsulation

## Goal

Understand how to model real concepts using classes, fields, constructors, and methods.

## Class vs object

- A **class** is a blueprint.
- An **object** is an instance of that blueprint.

## Example: a simple `BankAccount`

```java
public class BankAccount {
    private final String id;
    private long balanceCents;

    public BankAccount(String id) {
        this.id = id;
        this.balanceCents = 0;
    }

    public void deposit(long cents) {
        if (cents <= 0) throw new IllegalArgumentException("cents must be positive");
        balanceCents += cents;
    }

    public void withdraw(long cents) {
        if (cents <= 0) throw new IllegalArgumentException("cents must be positive");
        if (cents > balanceCents) throw new IllegalStateException("insufficient funds");
        balanceCents -= cents;
    }

    public long getBalanceCents() {
        return balanceCents;
    }

    public String getId() {
        return id;
    }
}
```

## Encapsulation

- Keep fields `private`.
- Provide safe operations (methods) to change state.

## Exercises

1. Add a `transferTo(BankAccount other, long cents)` method.
2. Add validation to prevent null/blank `id`.
3. Create a `toString()` that prints id and balance.

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

