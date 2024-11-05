import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileReader{
    public static void main(String args[]) throws FileNotFoundException{
        
        File fl = new File("./Target.txt");

        Scanner sc = new Scanner(fl);

        // String singleLine = sc.nextLine();
        // System.out.println(singleLine);

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

        sc.close();

    }
}