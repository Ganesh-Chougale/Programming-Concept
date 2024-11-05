import java.util.Scanner;

class PrimeNumiteration{

    public static void functionName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = sc.nextInt();
        sc.close();

        if(num < 2){
            System.out.println(num + " is not a prime number");
        }

        int count = 0;

        for(int i=1; i<=num; i++){
            if(num % i == 0){
                count += 1;
            }
        }

        if(count > 2){
            System.out.println(num + " is not a prime number");
        }else{
            System.out.println(num + " is a prime number");
        }

    
    }


    public static void main(String[] args) {
        functionName();
    }
}