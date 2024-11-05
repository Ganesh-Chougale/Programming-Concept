// Program that export all text from old file to new file.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileExporter {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String inputPath = "C:\\Users\\RaSkull\\Desktop\\Code\\Programming-Concept\\Own QNA\\Export text file to new file\\TXT\\OldText.txt";

        File fl = new File(inputPath);
        

        Scanner sc = new Scanner(fl);

        String scannedLines = "";
        while(sc.hasNextLine()){
            scannedLines = scannedLines.concat(sc.nextLine() + "\n");
            // merges each lines into one variable
        }

        String ouputPath = "C:\\Users\\RaSkull\\Desktop\\Code\\Programming-Concept\\Own QNA\\Export text file to new file\\TXT\\NewText.txt";

        FileWriter fw = new FileWriter(ouputPath);
        fw.write(scannedLines);
        fw.close();
        sc.close();
    }
    
}
