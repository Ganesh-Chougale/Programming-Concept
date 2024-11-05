import java.util.Scanner;

public class GOOTN_InBuilt {
    public static void GOOTN() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter The Second Number: ");
        int num2 = sc.nextInt();
        sc.close();

        int greatestNum = Math.max(num1, num2);
        // System.out.println(greatestNum);

        if(greatestNum == num1){
            System.out.println(greatestNum +" is greater than "+ num2);
        }else{
            System.out.println(greatestNum +" is greater than "+ num1);
        }
    }

    public static void main(String[] args) {
        GOOTN();
    }
}
