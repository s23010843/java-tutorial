# 15) Concurrency: Threads, Executors, Futures

## Goal

Understand how to run tasks concurrently and how to avoid common mistakes.

## Thread basics

```java
var t = new Thread(() -> System.out.println("running"));
t.start();
```

## Prefer executors

```java
ExecutorService pool = Executors.newFixedThreadPool(4);
Future<Integer> result = pool.submit(() -> 40 + 2);
System.out.println(result.get());
pool.shutdown();
```

## Common hazards

- data races (shared mutable state)
- deadlocks
- forgetting to shutdown executors

## Exercises

1. Run 10 tasks in a fixed thread pool and collect results.
2. Implement a thread-safe counter using `AtomicInteger`.
3. Demonstrate a race condition, then fix it.
