import java.util.Scanner;


public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String ip = sc.nextLine();

        String rev = " ";

        for (int i = ip.length() - 1; i >= 0; i--) {
            rev += ip.charAt(i);
        }

        System.out.println("\nOriginal: "+ ip);
        System.out.println("Reversed: " + rev);
        sc.close();
    }
    
}