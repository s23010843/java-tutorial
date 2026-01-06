# 12) Lambdas & Streams

## Goal

Write cleaner collection transformations and understand functional-style Java.

## Lambdas

```java
List<String> names = List.of("sam", "li", "asha");
names.forEach(n -> System.out.println(n.toUpperCase()));
```

## Streams

```java
List<String> names = List.of("sam", "li", "asha");
List<String> upper = names.stream()
        .map(String::toUpperCase)
        .sorted()
        .toList();
```

## Filtering and reducing

```java
int sum = List.of(1, 2, 3, 4).stream()
        .filter(n -> n % 2 == 0)
        .mapToInt(n -> n)
        .sum();
```

## Exercises

1. Given a list of words, return only those with length >= 5 (uppercase).
2. Compute the average of numbers using streams.
3. Group words by first letter using `Collectors.groupingBy`.
