package Employees_multi_class.Moduler;
import java.util.*;

public class EmployeeInformation{
    private static int index = 0;
    private Scanner sc = new Scanner(System.in);

    public void getUserInput(){
        
        System.out.print("Enter the first name: ");
        String firstName = sc.next();
        System.out.print("Enter the last name: ");
        String lastName = sc.next();
        System.out.print("Enter the city: ");
        String city = sc.next();
        System.out.print("Enter the Contact: ");
        long mobileNumber = sc.nextLong();

        Employee.country = "India"; // static input

        Employee emp = new Employee(firstName, lastName, city, mobileNumber);
        getStudentInformation(emp);
        index++;
    }

    public void getStudentInformation(Employee emp){
        System.out.println(emp.firstName + " " + emp.lastName + " lives in " + emp.city + ", " + Employee.country + ". and the contact number is: " + emp.mobileNumber);
    }

}
