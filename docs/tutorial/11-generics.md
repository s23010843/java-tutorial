# 11) Generics (the useful parts)

## Goal

Write type-safe reusable code (and read generic code without panic).

## Why generics?

Without generics you lose type safety:

```java
List items = new ArrayList();
items.add("hi");
Integer x = (Integer) items.get(0); // runtime crash
```

With generics:

```java
List<String> items = new ArrayList<>();
items.add("hi");
String x = items.get(0);
```

## Generic methods

```java
static <T> T first(List<T> list) {
    return list.get(0);
}
```

## Wildcards

- `List<? extends Number>`: list of some subtype of Number (read-only-ish)
- `List<? super Integer>`: list of Integer or its supertype (write-friendly)

Rule of thumb: PECS
- Producer Extends
- Consumer Super

## Exercises

1. Implement `Box<T>` with `get()` and `set(T)`.
2. Write a method `sum(List<? extends Number> nums)` returning `double`.
