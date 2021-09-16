import java.util.Scanner;

public class OnePointFiveE2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("What is your legal age?");
    int age = Integer.parseInt(input.nextLine());
    boolean vote = (age>17) ? true : false;
    System.out.println("You are old enough to vote: " + vote);
    }
}
