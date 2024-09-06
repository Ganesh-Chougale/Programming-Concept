import java.util.Scanner;

public class SORN_Formulae {
    
    public static void sorn() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        sc.close();

        int sum = num2*(num2+1)/2 - num1*(num1+1)/2 + num1;
        System.out.println("The sum of "+num1+" & "+num2+" is: "+sum);
    }

    public static void main(String[] args) {
        sorn();
    }
}
