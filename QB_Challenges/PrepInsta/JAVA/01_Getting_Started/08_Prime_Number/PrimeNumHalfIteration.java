import java.util.Scanner;

public class PrimeNumHalfIteration {

    public static void functionName() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    sc.close();

    boolean isPrime = true;

    if(num<2){
        isPrime = false;
    }else{
        for(int i=2; i<num/2; i++){
            if(num % i == 0){
                isPrime = false;
            }
        }
    }

    String result = isPrime ? " is a prime number." : " is not a prime number.";
    System.out.println(num + result);


    }

    public static void main(String[] args) {
        functionName();
    }
    
}
