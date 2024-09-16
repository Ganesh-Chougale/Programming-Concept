import java.util.Scanner;

public class Temp {

    public static void functionName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        sc.close();

        int lowest = (num1 < num2) ? num1 : num2;

        int range = (num1*num2)/lowest;

        int m1 = 0, m2 = 0;

    
    }

    public static void main(String[] args) {
        functionName();
    }
    
}
