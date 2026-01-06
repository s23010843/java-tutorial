# 9) Strings & I/O

## Goal

Work with strings safely and do basic file input/output.

## Strings

- `String` is immutable.
- Prefer `StringBuilder` for repeated concatenation in loops.

```java
var sb = new StringBuilder();
for (int i = 0; i < 3; i++) {
    sb.append(i).append(",");
}
System.out.println(sb);
```

## Files (NIO.2)

```java
Path path = Path.of("notes.txt");
Files.writeString(path, "Hello\n");
String text = Files.readString(path);
System.out.println(text);
```

## Exercises

1. Read a text file and count lines.
2. Given a sentence, count word frequency.
3. Implement `isPalindrome(String s)` ignoring spaces and case.
