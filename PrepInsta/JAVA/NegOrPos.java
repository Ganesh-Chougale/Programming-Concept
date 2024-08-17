import java.util.Scanner;

public class NegOrPos{
    public static void negOrPos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        if (num>0) {
            System.out.println("The Given Number "+num+" is Positive");
        }else if(num==0){
            System.out.println("The Given Number "+num+" is Zero");
        }else{
            System.out.println("The Given Number "+num+" is Negative");
        }
    
    }

    public static void main(String[] args) {
        negOrPos();
    }

}