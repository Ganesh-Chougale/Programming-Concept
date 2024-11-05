import java.util.Scanner;

public class LeapBoolaan {

        public static void isLeap() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the year: ");
            int year = sc.nextInt();
            sc.close();

            boolean leap;

            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                leap = true;
            } else {
                leap = false;
            } // end

            if(leap){
                System.out.println(year + " is a leap year");
            }else{
                System.out.println(year + " is not a leap year");
            } // end

        }

        public static void main(String[] args) {
            isLeap();
        }
}
