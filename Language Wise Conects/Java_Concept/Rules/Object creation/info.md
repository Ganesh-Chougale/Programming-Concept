to create object we need a class for it

```java
class Person{

    String name;
    int age;

    public Person(){    // this is a object constructor function

    }
    // RN.1: a constructor name is strictly need to same as classname
    // RN.2: a constructor shouldn't have any datatype not even void, or else java will treat it as regular function/method

    public void info(){
        System.out.println(name + " is " + age + " years old.");
    }
}
```