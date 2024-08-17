import java.util.Scanner;

public class GreatestOfTwoNumbers {

    public static void greatestOfTwoNumbers() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter The Second Number: ");
        int num2 = sc.nextInt();
        sc.close();

        if(num1>num2){
            System.out.println(num1+" is the greatest number");
        }else{
            System.out.println(num2+" is the greatest number");
        }
    
    }

    public static void main(String[] args) {
        greatestOfTwoNumbers();
    }
    
}
