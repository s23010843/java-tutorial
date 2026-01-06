# 8) Exceptions

## Goal

Handle failures correctly: when to throw exceptions, how to catch them, and how to design error messages.

## Checked vs unchecked

- **Unchecked** exceptions: extend `RuntimeException` (common for programming errors).
- **Checked** exceptions: must be declared/handled (common with I/O).

## Throwing exceptions

```java
if (amount <= 0) {
    throw new IllegalArgumentException("amount must be positive");
}
```

## try/catch/finally

```java
try {
    int x = Integer.parseInt("123");
    System.out.println(x);
} catch (NumberFormatException e) {
    System.out.println("Not a number");
} finally {
    // runs even if exception occurs
}
```

## try-with-resources

Use it for resources like files/streams:

```java
try (var reader = Files.newBufferedReader(Path.of("data.txt"))) {
    System.out.println(reader.readLine());
}
```

## Exercises

1. Write a method that parses int from string and returns `OptionalInt` instead of throwing.
2. Create a custom exception `InsufficientFundsException` and use it in `withdraw`.
