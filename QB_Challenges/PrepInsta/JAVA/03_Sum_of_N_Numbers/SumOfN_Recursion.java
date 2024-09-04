import java.util.Scanner;

public class SumOfN_Recursion {

    public static int SONN(int num) {
        
        if(num == 1){
            return 1;
        }

        return num + SONN(num - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int digit = sc.nextInt();
        System.out.println("the sum of first "+digit+" numbers is: "+ SONN(digit));
        sc.close();
    }
    
}
