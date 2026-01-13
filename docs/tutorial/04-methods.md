# 4) Methods

## Goal

Write reusable code with methods, parameters, return values, and overloading.

## A simple method

```java
static int add(int a, int b) {
    return a + b;
}
```

Call it:

```java
int result = add(2, 3);
```

## void methods

```java
static void greet(String name) {
    System.out.println("Hello, " + name);
}
```

## Method overloading

Same method name, different parameter types or counts:

```java
static int add(int a, int b) { return a + b; }
static double add(double a, double b) { return a + b; }
```

## Pass-by-value (important!)

Java is pass-by-value.

- For primitives: the value is copied.
- For references: the reference value is copied (two variables can point to the same object).

## Exercises

1. Write `max(int a, int b)`.
2. Write `isPrime(int n)`.
3. Write `reverse(String s)`.

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