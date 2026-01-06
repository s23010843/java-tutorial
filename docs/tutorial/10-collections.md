# 10) Collections: List, Set, Map

## Goal

Use Java collections confidently and learn when to pick which.

## List

- ordered
- allows duplicates

```java
List<String> names = new ArrayList<>();
names.add("Asha");
names.add("Asha");
```

## Set

- no duplicates
- order depends on implementation

```java
Set<String> unique = new HashSet<>();
unique.add("Asha");
unique.add("Asha");
System.out.println(unique.size()); // 1
```

## Map

- key/value

```java
Map<String, Integer> counts = new HashMap<>();
counts.put("apple", 2);
counts.put("apple", 3); // overwrites
```

## Big-O intuition (very rough)

- `ArrayList` random access: ~O(1)
- `ArrayList` insert/remove in middle: ~O(n)
- `HashMap` lookup by key: ~O(1) average

## Exercises

1. Count word frequency using `Map<String, Integer>`.
2. Remove duplicates from a list using a `Set`.
3. Sort a list of custom objects (create `Person(name, age)` and sort by age).
