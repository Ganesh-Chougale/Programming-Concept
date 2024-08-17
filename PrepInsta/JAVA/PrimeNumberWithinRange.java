import java.util.Scanner;

public class PrimeNumberWithinRange {

    public static boolean isPrime(int num) {
        if(num <= 1) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false;

        for(int i = 3; i<= num/2; i++){
            if(num % i == 0) return false;
        }
        
        return true;    
    }
    
    public static void primeNumberWithinRange() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        sc.close();

        if(num1>num2){
            System.out.println("please enter second number is greater than first");
        }

        if(num1<=1 || num2<=1){
            System.out.println("please Enter Greater numbers than that");
            return;
        }


        System.out.print("The prime Numbers are: ");
        for(int i=num1; i<=num2; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    
    }
    public static void main(String[] args) {
        primeNumberWithinRange();
    }
}
