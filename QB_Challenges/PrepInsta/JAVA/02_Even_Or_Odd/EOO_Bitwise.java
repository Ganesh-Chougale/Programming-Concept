import java.util.Scanner;

public class EOO_Bitwise {
    
    public static void EOO() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    sc.close();

    String result =
    ((num & 1) == 0) ?
    num + " is a Even Number" : 
    num + " is a Odd Number" ;

    System.out.println(result);

    }

    public static void main(String[] args) {
        EOO();
    }
}
