# 3) Control Flow

## Goal

Make decisions and repeat work using `if`, `switch`, and loops.

## if / else

```java
int score = 82;
if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else {
    System.out.println("C or below");
}
```

## switch

Modern switch (recommended):

```java
String day = "MON";
String type = switch (day) {
    case "SAT", "SUN" -> "weekend";
    default -> "weekday";
};
```

## while / do-while

```java
int i = 1;
while (i <= 3) {
    System.out.println(i);
    i++;
}
```

## for loops

```java
for (int n = 0; n < 5; n++) {
    System.out.println(n);
}
```

Enhanced for-loop:

```java
int[] values = {10, 20, 30};
for (int v : values) {
    System.out.println(v);
}
```

## Exercises

1. Print numbers 1..100, but:
   - print `Fizz` for multiples of 3
   - print `Buzz` for multiples of 5
   - print `FizzBuzz` for both
2. Convert a number (1..7) into weekday name using `switch`.
3. Sum an array of ints using both `for` and enhanced-for.
