import java.util.Scanner;

public class PrimeNumRecurtion {
    
    public static boolean functionName(int i, int n) {

        if(n<2) return false;

        if(i == n) return true;

        if(n % i == 0) return false;

        i += 1;

        return(functionName(i, n));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        sc.close();

        boolean isPrime = true;
        isPrime = functionName(2, num);

        String result = isPrime ? " is a prime number." : " is not a prime number";
        System.out.println(num + result);

        
    }
}
