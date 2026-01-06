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
