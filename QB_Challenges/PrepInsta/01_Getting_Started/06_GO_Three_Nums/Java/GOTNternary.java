import java.util.Scanner;

public class GOTNternary {

    public static void GOTN() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second name: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third name: ");
        int num3 = sc.nextInt();
        sc.close();

        int temp, result;
        
        temp = num1>num2 ? num1:num2;
        result = temp>num3 ? temp:num3;

        System.out.println(result + " is greatest number here");
    
    }

    public static void main(String[] args) {
        GOTN();
    }
    
}
