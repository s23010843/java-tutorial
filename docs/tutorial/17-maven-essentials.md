# 17) Maven Essentials (Recommended)

## Goal

Use Maven to manage dependencies, compile, and run tests in a repeatable way.

## Why Maven?

- Everyone can build the same way
- Easy dependency management
- Standard project layout

## Install

- Install Maven, verify:

```powershell
mvn -version
```

## Standard layout

- `src/main/java` → production code
- `src/test/java` → tests

## Common commands

- Compile: `mvn -q test` (also runs tests)
- Run tests: `mvn -q test`

## Minimal `pom.xml` ingredients

- Java version
- JUnit 5 dependency
- Surefire plugin (often auto)

If you want, I can scaffold a working Maven sample module in this repo.

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

