# 13) Dates & Time (java.time)

## Goal

Use modern Java date/time classes correctly.

## Use `java.time` (not `Date`/`Calendar` for new code)

```java
LocalDate today = LocalDate.now();
LocalDate birthday = LocalDate.of(2000, 1, 1);
Period age = Period.between(birthday, today);
```

## Time zones

```java
ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
ZonedDateTime colombo = ZonedDateTime.now(ZoneId.of("Asia/Colombo"));
```

## Formatting

```java
DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
System.out.println(today.format(fmt));
```

## Exercises

1. Parse a date string `2026-01-06` into `LocalDate`.
2. Compute days between two dates.
3. Print current time in 3 time zones.
