import java.util.Scanner;

public class Armstrong {

    public static int raisedTo(int n, int len){
        int result = 1;
        for(int i =0; i<len; i++){   
            result = result * n;
        }
        return result;
    }
    // powerOf function



    public static boolean isArmstrong(int num) {
        int sum = 0;
        int originalNum = num;
        int length = Integer.toString(num).length();

        while(num != 0){
            int curDIg = num %10;
            sum = sum + raisedTo(curDIg, length);
            num /= 10;
        }

        return sum == originalNum;
    
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        sc.close();

        if(isArmstrong(num)){
            System.out.println(num+" is an Armstrong Number");
        }else{
            System.out.println(num+" is an Armstrong Number");
        }
    }
}
