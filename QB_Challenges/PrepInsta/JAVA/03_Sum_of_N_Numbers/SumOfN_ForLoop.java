import java.util.Scanner;

public class SumOfN_ForLoop {

    public static void SONN() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();

        int sum = 0;
        for(int i = 0; i<=num; i++){
            sum += i;
        }

        System.out.println("the sum of first "+num+" numbers is: "+sum);
    
    }

    public static void main(String[] args) {
        SONN();
    }
    
}
