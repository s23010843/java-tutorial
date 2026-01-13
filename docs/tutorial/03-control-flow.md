# 3) Control Flow

## Goal

Make decisions and repeat work using `if`, `switch`, and loops.

## if / else

```java
int score = 82;
if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else {
    System.out.println("C or below");
}
```

## switch

Modern switch (recommended):

```java
String day = "MON";
String type = switch (day) {
    case "SAT", "SUN" -> "weekend";
    default -> "weekday";
};
```

## while / do-while

```java
int i = 1;
while (i <= 3) {
    System.out.println(i);
    i++;
}
```

## for loops

```java
for (int n = 0; n < 5; n++) {
    System.out.println(n);
}
```

Enhanced for-loop:

```java
int[] values = {10, 20, 30};
for (int v : values) {
    System.out.println(v);
}
```

## Exercises

1. Print numbers 1..100, but:
   - print `Fizz` for multiples of 3
   - print `Buzz` for multiples of 5
   - print `FizzBuzz` for both
2. Convert a number (1..7) into weekday name using `switch`.
3. Sum an array of ints using both `for` and enhanced-for.

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

