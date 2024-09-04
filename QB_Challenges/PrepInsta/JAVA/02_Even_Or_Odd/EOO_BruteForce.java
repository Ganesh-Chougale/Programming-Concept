import java.util.Scanner;

public class EOO_BruteForce {

    public static void EOO() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();

        if(num % 2 == 0){
            System.out.println(num+" is Even Number");
        }else{
            System.out.println(num+" is Odd Number`");
        }
    
    }

    public static void main(String[] args) {
        EOO();
    }
    
}
