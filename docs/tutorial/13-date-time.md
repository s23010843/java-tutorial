# 13) Dates & Time (java.time)

## Goal

Use modern Java date/time classes correctly.

## Use `java.time` (not `Date`/`Calendar` for new code)

```java
LocalDate today = LocalDate.now();
LocalDate birthday = LocalDate.of(2000, 1, 1);
Period age = Period.between(birthday, today);
```

## Time zones

```java
ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
ZonedDateTime colombo = ZonedDateTime.now(ZoneId.of("Asia/Colombo"));
```

## Formatting

```java
DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
System.out.println(today.format(fmt));
```

## Exercises

1. Parse a date string `2026-01-06` into `LocalDate`.
2. Compute days between two dates.
3. Print current time in 3 time zones.

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

