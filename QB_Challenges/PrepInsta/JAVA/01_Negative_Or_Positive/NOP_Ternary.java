import java.util.Scanner;

public class NOP_Ternary {
    
    public static void NOP() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        sc.close();
        
        String result =
        (num > 0) ? num + " is a postive number." :
        (num < 0) ? num + " is a negative number":
        num +" is zero";
        
        System.out.println(result);
                    
    }

    public static void main(String[] args) {
        NOP();
    }
}
