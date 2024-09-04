import java.util.Scanner;

public class NOP_Nested_IfElse {
    

    public static void NOP() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int num = sc.nextInt();

    if(num !=0){
        if(num>0){
        System.out.println(num+" is positive Number");
    }else{
            System.out.println(num+" is negative Number");
        }
    }else{
        System.out.println(num+" is zero");
    }
    }

    public static void main(String[] args) {
        NOP();
    }
}
