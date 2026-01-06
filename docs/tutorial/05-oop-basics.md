# 5) OOP Basics: Classes, Objects, Encapsulation

## Goal

Understand how to model real concepts using classes, fields, constructors, and methods.

## Class vs object

- A **class** is a blueprint.
- An **object** is an instance of that blueprint.

## Example: a simple `BankAccount`

```java
public class BankAccount {
    private final String id;
    private long balanceCents;

    public BankAccount(String id) {
        this.id = id;
        this.balanceCents = 0;
    }

    public void deposit(long cents) {
        if (cents <= 0) throw new IllegalArgumentException("cents must be positive");
        balanceCents += cents;
    }

    public void withdraw(long cents) {
        if (cents <= 0) throw new IllegalArgumentException("cents must be positive");
        if (cents > balanceCents) throw new IllegalStateException("insufficient funds");
        balanceCents -= cents;
    }

    public long getBalanceCents() {
        return balanceCents;
    }

    public String getId() {
        return id;
    }
}
```

## Encapsulation

- Keep fields `private`.
- Provide safe operations (methods) to change state.

## Exercises

1. Add a `transferTo(BankAccount other, long cents)` method.
2. Add validation to prevent null/blank `id`.
3. Create a `toString()` that prints id and balance.
