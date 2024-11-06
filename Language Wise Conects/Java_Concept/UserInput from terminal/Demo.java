import java.util.Scanner;

public class Demo{

    public static void UserInput() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Name: ");
    String txt = sc.nextLine();
    System.out.print("Enter Your age: ");
    int num = sc.nextInt();
    System.out.println("Your name is " +txt+ " & your age is " +num);
    sc.close();
    }
    
    public static void main(String[] args) {
        UserInput();
    }
}