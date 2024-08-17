import java.util.Scanner;

public class LeapYearOrNot {
    public static void leapOrNot() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if(year%4==0){
            System.out.println(year+" is a leap year");
        }else{
            System.out.println(year+" is not a leap year");
        }
    
    }

    public static void main(String[] args) {
        leapOrNot();
    }

}
