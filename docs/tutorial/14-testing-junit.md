# 14) Testing with JUnit 5 (Basics)

## Goal

Learn unit testing fundamentals: arrange/act/assert, naming, and running tests.

## Why tests?

- Catch regressions
- Enable refactoring
- Document behavior

## JUnit 5 example

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {
    @Test
    void add_addsTwoNumbers() {
        assertEquals(5, MathUtil.add(2, 3));
    }
}
```

## What to test

- Pure logic (easy)
- Edge cases
- Error cases

Avoid testing:
- private methods directly
- trivial getters/setters

## Exercises

1. Write tests for `isPrime`.
2. Write tests for `reverse(String)` including empty and null handling (decide expected behavior).

Note: this chapter pairs best with the Maven chapter to run tests easily.
