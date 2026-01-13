# 1) Getting Started

## Goal

- Install a JDK
- Compile and run a Java program
- Understand what `javac` and `java` do

## Install the JDK (recommended: Java 17 or 21)

- Install a JDK from a reputable provider (e.g., Adoptium Temurin).
- Verify installation:

PowerShell:

```powershell
java -version
javac -version
```

If those commands are not found, your PATH is not set.

## Your first program

Create a file named `Hello.java`:

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

Compile:

```powershell
javac Hello.java
```

Run:

```powershell
java Hello
```

## What just happened?

- `javac` compiles `.java` source code into `.class` bytecode.
- `java` runs bytecode on the JVM (Java Virtual Machine).

## Exercises

1. Change the message and re-run.
2. Print two lines.
3. Print your name using `args`:
   - Run `java Hello Alice` and print `Alice`.

## Common mistakes

- File name and public class name must match (`Hello.java` and `public class Hello`).
- Don’t run `java Hello.java` (that’s not how the classic compile/run flow works).


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

