import java.util.Scanner;

public class GreatestOfThreeNumbers {

    public static void greatestOfThreeNumbers() {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        sc.close();

        if(num1>num2 && num1>num3){
            System.out.println(num1+" is the greatest number");
        }else if(num2>num1 && num2>num3){
            System.out.println(num2+ " is the greatest number");
        }else{
            System.out.println(num3+ " is the greatest number");
        }
    
    }
    public static void main(String[] args) {
        greatestOfThreeNumbers();
    }
    
}
