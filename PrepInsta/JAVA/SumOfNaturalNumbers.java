import java.util.Scanner;

public class SumOfNaturalNumbers {
    
    public static void sumOfNaturalNumbers() {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        int sum = 0;
        for(int i = num; i>0; i--){
            sum = sum+i;
        }
        System.out.println("The sum of all naturel number from 1 to "+num+" is: "+sum);
    }

    public static void main(String[] args) {
        sumOfNaturalNumbers();
    }
}
