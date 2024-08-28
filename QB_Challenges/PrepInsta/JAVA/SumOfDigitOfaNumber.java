import java.util.Scanner;

public class SumOfDigitOfaNumber {
    
    public static void sumOfDigitOfaNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        sc.close();

        int sum = 0;
        int digit;

        while(number>0){
            digit = number % 10;
            sum = sum + digit;
            number = number/10;
        }

        System.out.println("Sum of digits of a Number is: "+sum);
    
    }
    public static void main(String[] args) {
        sumOfDigitOfaNumber();
    }
}
