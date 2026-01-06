# 17) Maven Essentials (Recommended)

## Goal

Use Maven to manage dependencies, compile, and run tests in a repeatable way.

## Why Maven?

- Everyone can build the same way
- Easy dependency management
- Standard project layout

## Install

- Install Maven, verify:

```powershell
mvn -version
```

## Standard layout

- `src/main/java` → production code
- `src/test/java` → tests

## Common commands

- Compile: `mvn -q test` (also runs tests)
- Run tests: `mvn -q test`

## Minimal `pom.xml` ingredients

- Java version
- JUnit 5 dependency
- Surefire plugin (often auto)

If you want, I can scaffold a working Maven sample module in this repo.
