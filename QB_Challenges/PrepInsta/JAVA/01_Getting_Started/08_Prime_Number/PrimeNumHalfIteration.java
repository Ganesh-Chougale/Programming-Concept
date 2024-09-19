import java.util.Scanner;

public class PrimeNumHalfIteration {

    public static void functionName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();

        boolean isPrime = true;

        if(num < 2){
            isPrime = false;
        }else{
            for(int i=2; i<=num/2; i++){
                if(num % i == 0){
                    isPrime = false;
                }
            }
        }

        String result = isPrime ? "a Prime" : "not a Prime";

        System.out.println(num+" is "+result+" number");
    
    }

    public static void main(String[] args) {
        functionName();
    }
    
}
