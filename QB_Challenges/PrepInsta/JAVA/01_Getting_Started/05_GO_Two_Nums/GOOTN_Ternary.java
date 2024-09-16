import java.util.Scanner;

public class GOOTN_Ternary {

    public static void GOOTN() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        sc.close();

        String result = (num1>num2) ?
        num1+" is greater than "+ num2 :
        num2+" is greater than "+ num1;

        System.out.println(result);

    
    }

    public static void main(String[] args) {
        GOOTN();
    }
    
}
