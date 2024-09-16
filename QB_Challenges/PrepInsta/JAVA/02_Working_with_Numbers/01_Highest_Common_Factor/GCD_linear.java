import java.util.Scanner;

public class GCD_linear {

    void functionName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        sc.close();

        if(num1 < 1 || num2 < 1){
            System.out.println("please enter values greater than zero");
            return;
        }
        
        int minHalf;

        if(num1>num2){
            minHalf = (num1/2);            
        }else{
            minHalf = (num2/2); 
        }

        int gdc = 0;
        for(int i = 1; i<= minHalf; i++){
            if ( num1 % i == 0 && num2 % i == 0){
                gdc = i;
            }
        }

        System.out.println("GDC or HCF of number "+ num1 +" & "+ num2+" is: "+gdc);
    }


    public static void main(String[] args) {
        GCD_linear fn = new GCD_linear();
        fn.functionName();       
    }
    

    
}
