import java.util.Scanner;

public class PrimeNumsBetRangeIdeal {

    public static boolean isPrime(int n, int s, int l) {

        if(n<2){
            return false;
        }
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        
        return true;    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter last number: ");
        int last = sc.nextInt();
        sc.close();

        int start;
        int end;
        if(first < last){
            start = first;
            end = last;
        }else{
            start = last;
            end = first;
        }

        if(start < 0 || end < 0){
            System.out.println("please enter valid numbers");
            return;
        }
        
        for(int i = start; i<=end; i++){
            if(isPrime(i, start, last)){
                System.out.println(i);
            }
        }
        
    }
    
}
