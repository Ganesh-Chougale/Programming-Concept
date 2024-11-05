import java.util.Scanner;

public class PrimeNumOPT{

    public static void functionName() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Number: ");
    int num = sc.nextInt();
    sc.close();

    boolean isPrime = true;
    if(num<2){
        isPrime = false;
    }else{
        for(int i = 2; i< Math.sqrt(num);i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
    }

    String result = isPrime ? "a prime number" : "not a prime number";
    System.out.println(num +" is "+ result);
    
    }

    public static void main(String[] args) {
        functionName();
    }
}