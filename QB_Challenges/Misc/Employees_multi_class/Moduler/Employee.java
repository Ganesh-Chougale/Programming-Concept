package Employees_multi_class.Moduler;
public class Employee {

    String firstName;
    String lastName;
    String city;
    long mobileNumber;
    static String country;

    public Employee(String firstName, String lastName, String city, long mobileNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.mobileNumber = mobileNumber;
    }

}