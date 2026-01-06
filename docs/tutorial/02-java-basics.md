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
