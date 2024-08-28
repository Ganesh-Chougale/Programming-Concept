import java.util.Scanner;

public class SumOfNumbersWithinRange {
    
    public static void sumOfNumbersWithinRange() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second Number: ");
        int num2 = sc.nextInt();
        sc.close();

        int sum=0;
        
        for(int i = num1; i<=num2; i++){
            sum = sum + i;
        }
        System.out.println("The Addition Of Numbers Between range "+num1+" to "+num2+" is: "+sum);
    }

    public static void main(String[] args) {
        sumOfNumbersWithinRange();
    }
}
