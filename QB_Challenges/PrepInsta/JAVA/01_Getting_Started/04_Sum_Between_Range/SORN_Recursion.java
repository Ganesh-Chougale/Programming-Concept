import java.util.Scanner;

public class SORN_Recursion {
    
    public static int sorn(int sum, int num1, int num2) {
        if(num1 > num2){
            return sum;
        }
        return num1 + sorn(sum, num1+1, num2);
    }

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        sc.close();
        int sum = sorn(0, num1, num2);
        System.out.println("The sum of "+num1+" & "+num2+" is: "+sum);

    }
}
