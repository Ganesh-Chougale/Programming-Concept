import java.util.Scanner;

public class PrimeNumIteration {

    public static void primeNum() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        sc.close();

        int count = 0;

        if(num < 2){
            System.out.println(num + " is not a prime number");
            return;
        }
        
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                count += 1;
            }
        }

        if(count > 2){
            System.out.println(num + " is not a prime number");
        }else{
            System.out.println(num + " is a prime number");
        }
    
    }


    public static void main(String[] args) {
        primeNum();
    }
    
}
