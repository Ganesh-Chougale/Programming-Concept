class Person{
    String name;
    int age;
    // variable assign

    private static int count = 0; // to check object counts

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        count++;
    }

    public void info(){
        System.out.println(name+ " is " + age + " years old");
    }

    public static void displayCount(){
        System.out.println("The current count of objects: "+ count);
    }
}

public class CountObj{
    public static void main(String[] args) {
        Person aditya = new Person("Aditya", 24); 
        Person balaram = new Person("Balaram", 34); 
        Person chetan = new Person("Chetan", 28);

        Person.displayCount();
    }

}