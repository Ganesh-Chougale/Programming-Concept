import java.util.Scanner;

public class Table2to20 {

    public static void tableTo20() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        System.out.println("Table of " + num + " is: ");
        for (int i = 2; i <= 20; i++) {
            System.out.println(num + " into " + i + ": " + num * i);
        }

    }

    public static void main(String[] args) {
        tableTo20();
    }

}
