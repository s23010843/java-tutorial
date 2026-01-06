# 6) Inheritance & Polymorphism (and when not to use them)

## Goal

Learn how inheritance works, how polymorphism enables flexible code, and why composition is often a better default.

## Inheritance basics

```java
class Animal {
    void speak() {
        System.out.println("...");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("woof");
    }
}
```

## Polymorphism

```java
Animal a = new Dog();
a.speak(); // woof
```

Your code can depend on the base type (`Animal`) and still work with any subclass.

## When inheritance is risky

Inheritance can cause:

- tight coupling
- fragile base class problems
- confusing hierarchies

Prefer **composition** when possible: "has-a" over "is-a".

## Exercises

1. Create `Shape` with subclasses `Circle` and `Rectangle` and a method `area()`.
2. Replace inheritance with composition in one example: create a `Logger` field used by another class.
