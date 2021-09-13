import java.util.Scanner;

public class OnePointTwoE2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String first = input.nextLine();
        System.out.println("Enter Last Name: ");
        String last = input.nextLine();
        StringBuilder reversedfirst = new StringBuilder();
        reversedfirst.append(first);
        reversedfirst.reverse();
        StringBuilder reversedlast = new StringBuilder();
        reversedlast.append(last);
        reversedlast.reverse();
        System.out.println("Full Name: " + first + " " + last);
        System.out.println("Reversed: " +reversedfirst + " " + reversedlast);
    }
}
