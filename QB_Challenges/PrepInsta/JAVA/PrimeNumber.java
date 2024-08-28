import java.util.Scanner;

public class PrimeNumber {
    
    public static void primeOrNot() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();

        if (num <= 1) {
            System.out.println("The Number " + num + " is not a prime number");
            return;
        }

        boolean isPrime = true;

            for(int i=2; i<=num/2; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("The Number "+num+" is a prime number");
            }else{
                System.out.println("The Number "+num+" is not a prime number");
            }
    
    }

    public static void main(String[] args) {
        primeOrNot();
    }
}