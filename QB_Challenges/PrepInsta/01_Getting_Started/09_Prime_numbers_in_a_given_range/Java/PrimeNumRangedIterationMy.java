import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class PrimeNumRangedIterationMy{

    public static void functionName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter last number: ");
        int last = sc.nextInt();
        sc.close();

        int start;
        int end;
        Collection<Integer> pNum = new ArrayList<Integer>();

        
        
        if(first < 0 || last < 0){
            System.out.println("Please input positive numbers");
            return;
        }
        
        
        
        if(first > last){
            start = last;
            end = first;
        }else{
            start = first;
            end = last;
        }
        
        
        
        for(int i = start; i<=end; i++){
            boolean isPrime = true;

            if(i<2){
                isPrime = false;
            }
            else{
                for(int j = 2; j<=end-1; j++){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            
            if(isPrime){
                pNum.add(i);
            }
        }

        System.out.println("Prime Numbers between " +start+ " & " +end+ " is: "+ pNum);

    }

    public static void main(String[] args) {
        functionName();
    }
}