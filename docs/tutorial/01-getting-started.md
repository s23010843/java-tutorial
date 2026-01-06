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
