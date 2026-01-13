# 10) Collections: List, Set, Map

## Goal

Use Java collections confidently and learn when to pick which.

## List

- ordered
- allows duplicates

```java
List<String> names = new ArrayList<>();
names.add("Asha");
names.add("Asha");
```

## Set

- no duplicates
- order depends on implementation

```java
Set<String> unique = new HashSet<>();
unique.add("Asha");
unique.add("Asha");
System.out.println(unique.size()); // 1
```

## Map

- key/value

```java
Map<String, Integer> counts = new HashMap<>();
counts.put("apple", 2);
counts.put("apple", 3); // overwrites
```

## Big-O intuition (very rough)

- `ArrayList` random access: ~O(1)
- `ArrayList` insert/remove in middle: ~O(n)
- `HashMap` lookup by key: ~O(1) average

## Exercises

1. Count word frequency using `Map<String, Integer>`.
2. Remove duplicates from a list using a `Set`.
3. Sort a list of custom objects (create `Person(name, age)` and sort by age).

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

