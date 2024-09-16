import java.util.Scanner;

public class GOTNifElseOne {
    public static void GOTN() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        sc.close();

    if (num1 >= num2 && num1 >= num3){
        System.out.println (num1 + " is the greater than "+ num2 +" & "+ num3);
    }
    else if (num2 >= num1 && num2 >= num3){
        System.out.println (num2 + " is the greater than "+ num1 +" & "+ num3);
    }
    else if (num3 >= num1 && num3 >= num2){
        System.out.println (num3 + " is the greater than "+ num1 +" & "+ num2);
    }


    }

    public static void main(String[] args) {
        GOTN();
    }

    
}
