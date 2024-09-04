import java.util.Scanner;

public class SumOfN_formulae {

    public static void SONN() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();
        
        // formulae
        int sum = (num*(num+1)/2);

        System.out.println("the sum of first "+num+" numbers is: "+sum);
        
    }

    public static void main(String[] args) {
        SONN();
    }
    
}
