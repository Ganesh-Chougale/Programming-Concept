import java.util.Scanner;

public class EOO_Ternary {

    public static void EOO() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();

        String result =
        (num % 2 == 0) ?
        "The given number "+num+" is Even Number" :
        "The given number "+num+" is Odd Number" ;

        System.out.println(result);
    
    }

    public static void main(String[] args) {
        EOO();
    }
}
