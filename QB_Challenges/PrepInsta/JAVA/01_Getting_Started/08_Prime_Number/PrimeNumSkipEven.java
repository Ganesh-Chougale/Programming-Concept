import java.util.Scanner;

public class PrimeNumSkipEven {

    public static void functionName() {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value: ");
        int n = sc.nextInt();
        sc.close();

        boolean isPrime = true;

        if(n < 2){
            isPrime = false;
        }else if(n == 2){
            isPrime = true;
        }else{
            for(int i = 3; i<Math.sqrt(n); i+=2 ){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        String result = isPrime ? "a prime number" : "not a prime number";
        System.out.println(n +" is "+ result);
    }

    public static void main(String[] args) {
        functionName();
    }
    
}
