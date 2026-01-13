# 2) Java Basics

## Goal

Learn the building blocks: variables, types, operators, and basic console output.

## The mental model

- Java is statically typed: variables have a declared type.
- Java is compiled to bytecode and run on the JVM.

## Variables and primitive types

Common primitives:

- `int` (32-bit integer)
- `long` (64-bit integer)
- `double` (floating point)
- `boolean` (`true/false`)
- `char` (single UTF-16 code unit)

Example:

```java
int age = 25;
long population = 8_000_000_000L;
double price = 19.99;
boolean active = true;
char grade = 'A';
```

### `var` (local type inference)

```java
var name = "Sam"; // inferred as String
```

Use `var` when it improves readability, not when it hides meaning.

## Reference types

- `String` is a reference type (an object)

```java
String city = "Colombo";
```

## Operators (the important ones)

- Arithmetic: `+ - * / %`
- Comparisons: `== != < <= > >=`
- Boolean logic: `&& || !`

Important:
- For objects (like `String`), use `.equals()` not `==`.

```java
String a = "hi";
String b = new String("hi");
System.out.println(a.equals(b)); // true
System.out.println(a == b);       // usually false
```

## Printing

```java
System.out.println("Hello");
System.out.printf("Age: %d%n", age);
```

## Exercises

1. Create variables of each primitive type and print them.
2. Convert Celsius to Fahrenheit: $F = C \times \frac{9}{5} + 32$.
3. Compare two strings using both `==` and `.equals()` and observe the difference.

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

