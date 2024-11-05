# compiling normal java programs within same folder.
if all relational java files in same folder like

```css
Moduler/
        ├── Employee.java
        ├── EmployeeInformation.java
        └── Main.java
```

& at header section do not have any package written in it we can directly comple & run file like this:

```bash
javac *.java
java Main
```

but the all the shared data will be intact only if all those files remains in same folder.


# Compiling java packages using fully-qualified name

But if you have same folder structure

```css
Employees_multi_class/
    └── Moduler/
        ├── Employee.java
        ├── EmployeeInformation.java
        └── Main.java
```
we cannot simply jump into end directory & run the program like this:

```bash
javac *.java
java Main
```

instead we need to go parent directory of or current package (Employees_multi_class)

```bash
javac Employees_multi_class/Moduler/*.java
java Employees_multi_class.Moduler.Main
```