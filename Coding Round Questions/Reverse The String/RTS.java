import java.util.Scanner;

public class RTS {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = sc.nextLine();
        sc.close();

        String reversed = reverseSTR(str);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseSTR(String txt) {
        if (txt == null || txt.isEmpty())
            throw new IllegalArgumentException("Please input the string first");
        if (txt.length() < 2)
            throw new IllegalArgumentException("String must be at least 2 characters long");

        // Convert the string to a char array for swapping
        char[] chars = txt.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        // Convert the modified char array back to a string
        return new String(chars);
    }
}
