# Plain Java Examples (No Build Tool)

These examples are meant to be run with just the JDK.

## Compile everything

From this folder:

```powershell
javac -d out (Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName })
```

## Run an example

```powershell
java -cp out tutorial.basics.Hello
```

If you’re using VS Code, you can also click Run above `main` methods.
