
import java.util.Scanner;

public class EvenOrOdd {
    public static void evenOrOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("The Given Number "+num+" is Even Number");
        }else{
            System.out.println("The Given Number "+num+" is Odd Number");
        }
    
    }

    public static void main(String[] args) {
        evenOrOdd();
    }
}
