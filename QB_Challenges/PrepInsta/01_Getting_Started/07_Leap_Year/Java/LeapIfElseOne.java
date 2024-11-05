import java.util.Scanner;

public class LeapIfElseOne {

    public static void isLeap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        sc.close();

        if(year % 400 == 0){
            System.out.println(year+" is a leap year");
        }else if(year % 4 == 0 && year % 100 != 0){
            System.out.println(year+" is a leap year");
        }else{
            System.out.println(year+" is not a leap year");
        }
    
    }

    public static void main(String[] args) {
        isLeap();
    }
    
}
