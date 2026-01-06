# 7) Interfaces & Abstract Classes

## Goal

Use interfaces for capabilities and abstraction; understand abstract classes and when they fit.

## Interfaces

```java
interface Payable {
    long calculatePayCents();
}

class Contractor implements Payable {
    private final long hourlyRateCents;
    private final int hours;

    Contractor(long hourlyRateCents, int hours) {
        this.hourlyRateCents = hourlyRateCents;
        this.hours = hours;
    }

    public long calculatePayCents() {
        return hourlyRateCents * hours;
    }
}
```

## Abstract classes

Use when you want shared code + some required methods:

```java
abstract class Employee {
    protected final String name;

    protected Employee(String name) {
        this.name = name;
    }

    abstract long calculatePayCents();
}
```

## Practical guideline

- Use **interfaces** for public APIs and "capabilities".
- Use **abstract classes** for shared implementation inside a family of classes.

## Exercises

1. Create `Storage` interface with methods `save(String key, String value)` and `load(String key)`.
2. Implement it with an in-memory `MapStorage`.
