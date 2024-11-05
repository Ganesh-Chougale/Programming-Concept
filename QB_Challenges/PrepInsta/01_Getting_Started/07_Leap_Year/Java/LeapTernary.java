import java.util.Scanner;

public class LeapTernary {

    public static void isLeap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        sc.close();

        int flag = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ? 1 : 0;

        if(flag == 1){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }
    
    }

    public static void main(String[] args) {
        isLeap();
    }
    
}
