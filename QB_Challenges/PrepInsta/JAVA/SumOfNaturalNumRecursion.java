import java.util.Scanner;

public class SumOfNaturalNumRecursion {

    public static int sumOfNaturalNumbREcursion(int n) {

    if(n==0){
        return 0;
    }
    return n + sumOfNaturalNumbREcursion(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        sc.close();
        int result = sumOfNaturalNumbREcursion(num);
        System.out.println("Sum of natural numbers up to " + num + " is: " + result);
    }
    
}
